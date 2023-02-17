package io.github.matheusfsantos.bancodigital.model;

public class BancoDados {
    private Conta dados[];
    private String extrato[];
    private Integer extratoTamanho;
    private Integer tamanho;
    
    
    public BancoDados() throws Exception{
        this.dados = new Conta[50];
        this.extrato = new String[10];
        this.tamanho = 0;
        this.extratoTamanho = 0;
        this.insereDados();
    }
    
    public void adiciona(Conta conta) {
        if(tamanho != dados.length) {
            dados[tamanho] = conta;
            tamanho++;
        } else {
            aumentaCapacidade();
            adiciona(conta); //Utiliza da recursão para o usuário não necessitar abrir o método add denovo
        }
    }
    
    public void adicionaExtrato(Conta transferidor, Conta destino, Double valor){
        if(extratoTamanho != extrato.length){
            extrato[extratoTamanho] = transferidor.getContaFormatada()+ "  ->  R$ " + valor + "  ->  " + destino.getContaFormatada();
            extratoTamanho++;
        } else {
            aumentaCapacidadeExtrato();
            adicionaExtrato(transferidor, destino, valor); //Utiliza da recursão para não perder nenhuma transação
        }
    }
    
    public Conta[] listar(){
        return dados;
    }
    
    public String[] listarExtrato(){
        return extrato;
    }
    
    public Conta procurar(String agencia, String numeroConta) throws Exception {
        for(Conta conta : dados){
            if(conta != null){
                if(conta.getAgencia().equals(agencia) && conta.getConta().equals(numeroConta))
                    return conta;
            }
        }
        
        throw new Exception("Dados inválidos");
    }
    
    public boolean verifica(String agencia, String numeroConta) {
        for(Conta conta : dados){
            if(conta != null){
                if(conta.getAgencia().equals(agencia) && conta.getConta().equals(numeroConta))
                    return true;
            }
        }
        
        return false;
    }

    public void transferir(Double valor, Conta transferidor, Conta destino) throws Exception {
        if(transferidor.equals(destino)){
            throw new Exception("Você não pode realizar uma transação para você mesmo");
        }
        
        for(Conta conta : dados) {
            if(conta != null) {
                if(conta.equals(transferidor)){
                    conta.sacar(valor);
                    salvar(transferidor);
                }
                
                if(conta.equals(destino)){
                    conta.depositar(valor);
                    salvar(destino);
                }
                    
            }
        }
    }

    private void salvar(Conta contaAtualizada) {
        for(Conta conta : dados){
            if(conta != null){
                if(conta.equals(contaAtualizada)){
                    conta = contaAtualizada;
                }
            }
        }
    }
    
    private void aumentaCapacidade(){
        Conta copia[] = dados;
        dados = new Conta[dados.length * 2];
        
        for(int i = 0; i < copia.length; i++){
            dados[i] = copia[i];
        }
    }
    
    private void aumentaCapacidadeExtrato() {
        String copia[] = extrato;
        extrato = new String[extrato.length * 2];
        
        for(int i = 0; i < copia.length; i++){
            extrato[i] = copia[i];
        }
    }
    
    private void insereDados() throws Exception{
        this.adiciona(new Conta("1111111", "301"));
        this.adiciona(new Conta("2222222", "301"));
        this.adiciona(new Conta("3333333", "301"));
        this.adiciona(new Conta("4444444", "301"));
        this.adiciona(new Conta("5555555", "301"));
        this.adiciona(new Conta("6666666", "301"));
        this.adiciona(new Conta("7777777", "301"));
    }
}