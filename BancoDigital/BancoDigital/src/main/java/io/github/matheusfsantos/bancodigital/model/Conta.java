package io.github.matheusfsantos.bancodigital.model;

public class Conta {
    private String conta;
    private String agencia;
    private Double saldo;

    public Conta() {}

    public Conta(String conta, String agencia) throws Exception {
        if(conta.length() == 7 && agencia.length() == 3) {
            this.conta = conta;
            this.agencia = agencia; 
            this.saldo = 1000.0;
        } else
            throw new Exception("Dados inválidos.");
    }
    
    @Override
    public boolean equals(Object object){
        if(object instanceof Conta && object != null){
            Conta conta = (Conta) object;
            
            if(this.getAgencia().equals(conta.getAgencia()) && this.getConta().equals(conta.getConta()))
                return true;
        }
        
        return false;
    }
    
    @Override
    public String toString(){
        return "[Conta = " + getConta() + "; Agencia = " + getAgencia() + "; Saldo = " + getSaldo() + "]";
    }
    
    public String getConta() {
        return conta;
    }
    
    public String getContaFormatada(){
        String contaFormatada = "";
        
        for(int i = 0; i < conta.length(); i++){
            if(i != 4)
                contaFormatada += conta.charAt(i);
            else {
                contaFormatada += "-" + conta.charAt(i);
            }
        }
        
        return contaFormatada;
    }

    protected void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    protected void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    
    public Double getSaldo() {
        return saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(Double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }
    
    public void sacar(Double valor) throws Exception{
        if(this.getSaldo() - valor < 0)
            throw new Exception("Você não pode realizar essa transação\n\n\nMotivo: Irá ficar negativado");
        else
            this.setSaldo(this.getSaldo() - valor);
    }
}