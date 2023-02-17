package io.github.matheusfsantos.bancodigital.view;

import io.github.matheusfsantos.bancodigital.model.BancoDados;
import io.github.matheusfsantos.bancodigital.model.Conta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private static BancoDados bancoDados;
    
    public Principal() throws Exception {
        initComponents();
        bancoDados = new BancoDados();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Esquerda = new javax.swing.JPanel();
        extrato = new javax.swing.JButton();
        saldo = new javax.swing.JButton();
        contas = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();
        nomeBanco = new javax.swing.JLabel();
        criarConta = new javax.swing.JButton();
        Direita = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        suaConta = new javax.swing.JLabel();
        suaConta_input = new javax.swing.JFormattedTextField();
        suaAgencia = new javax.swing.JLabel();
        suaAgencia_input = new javax.swing.JFormattedTextField();
        destinoConta = new javax.swing.JLabel();
        destinoConta_input = new javax.swing.JFormattedTextField();
        destinoAgencia = new javax.swing.JLabel();
        destinoAgencia_input = new javax.swing.JFormattedTextField();
        valor = new javax.swing.JLabel();
        transferir = new javax.swing.JButton();
        valor_input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        Esquerda.setBackground(new java.awt.Color(102, 0, 153));
        Esquerda.setForeground(new java.awt.Color(255, 255, 255));

        extrato.setFont(new java.awt.Font("Ubuntu Thin", 0, 24)); // NOI18N
        extrato.setText("Extrato Bancário");
        extrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exibirExtrato(evt);
            }
        });

        saldo.setFont(new java.awt.Font("Ubuntu Thin", 0, 24)); // NOI18N
        saldo.setText("Consultar Saldo");
        saldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarSaldo(evt);
            }
        });

        contas.setFont(new java.awt.Font("Ubuntu Thin", 0, 24)); // NOI18N
        contas.setText("Exibir Contas");
        contas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exibirContas(evt);
            }
        });

        sair.setFont(new java.awt.Font("Ubuntu Thin", 0, 24)); // NOI18N
        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout(evt);
            }
        });

        imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagem.setIcon(new javax.swing.ImageIcon("/home/matheus/Área de Trabalho/bancario.png")); // NOI18N

        nomeBanco.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        nomeBanco.setForeground(new java.awt.Color(255, 255, 255));
        nomeBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeBanco.setText("MBank");

        criarConta.setFont(new java.awt.Font("Ubuntu Thin", 0, 24)); // NOI18N
        criarConta.setText("Criar Conta");
        criarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                criarConta(evt);
            }
        });

        javax.swing.GroupLayout EsquerdaLayout = new javax.swing.GroupLayout(Esquerda);
        Esquerda.setLayout(EsquerdaLayout);
        EsquerdaLayout.setHorizontalGroup(
            EsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EsquerdaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(EsquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(contas, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(nomeBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(criarConta, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap())
        );
        EsquerdaLayout.setVerticalGroup(
            EsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EsquerdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(extrato, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(criarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(26, 26, 26))
        );

        Direita.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("Manjari Thin", 0, 48)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Banco Digital");

        suaConta.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        suaConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suaConta.setText("Sua Conta C:");

        try {
            suaConta_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        suaConta_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        suaAgencia.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        suaAgencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suaAgencia.setText("Sua Agencia:");

        try {
            suaAgencia_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        suaAgencia_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        destinoConta.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        destinoConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destinoConta.setText("Conta C. Destino:");

        try {
            destinoConta_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        destinoConta_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        destinoAgencia.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        destinoAgencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destinoAgencia.setText("Agencia Destino:");

        try {
            destinoAgencia_input.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        destinoAgencia_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        valor.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        valor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valor.setText("Valor:");

        transferir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        transferir.setText("Transferir");
        transferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferirMouseClicked(evt);
            }
        });

        valor_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout DireitaLayout = new javax.swing.GroupLayout(Direita);
        Direita.setLayout(DireitaLayout);
        DireitaLayout.setHorizontalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DireitaLayout.createSequentialGroup()
                        .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(suaConta)
                            .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DireitaLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(destinoConta))
                                .addGroup(DireitaLayout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(suaAgencia))
                                .addGroup(DireitaLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(valor)
                                        .addComponent(destinoAgencia)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destinoConta_input)
                            .addComponent(suaConta_input)
                            .addComponent(suaAgencia_input)
                            .addComponent(destinoAgencia_input)
                            .addComponent(valor_input, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                    .addGroup(DireitaLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        DireitaLayout.setVerticalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo)
                .addGap(52, 52, 52)
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaConta_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suaAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaAgencia_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinoConta_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(destinoAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinoAgencia_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(transferir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Esquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Direita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Direita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    /*
        Método do botão sair
    */
    private void logout(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout
        String extrato[] = bancoDados.listarExtrato();
        
        if(extrato[0] != null)
            JOptionPane.showMessageDialog(this, bancoDados.listarExtrato(), "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Não foi feita nenhuma transferencia bancária", "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }//GEN-LAST:event_logout

    
    
    /*
        Método que irá abrir a janela com as tabela das contas
    */
    private void exibirContas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exibirContas
        new Contas(bancoDados).setVisible(true);
    }//GEN-LAST:event_exibirContas

    
    
    /*
        Método que contem a lógica de consultar um saldo
    */
    private void consultarSaldo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarSaldo
        Conta conta = null;
        
        String agencia = JOptionPane.showInputDialog(null, "Qual a agencia da conta que deseja consultar", "Agencia", JOptionPane.QUESTION_MESSAGE);
        String numeroConta = JOptionPane.showInputDialog(null, "Qual o numero da conta que deseja consultar", "Agencia", JOptionPane.QUESTION_MESSAGE);
        
        
        try {
            conta = bancoDados.procurar(agencia, numeroConta);
            JOptionPane.showMessageDialog(null, "Conta: " + conta.getContaFormatada() + "\nSaldo: R$" + conta.getSaldo(), "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_consultarSaldo

    
    
    /*
        Método que contém a lógica do extrato bancário
    */
    private void exibirExtrato(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exibirExtrato
        String extrato[] = bancoDados.listarExtrato();
        
        if(extrato[0] != null)
            JOptionPane.showMessageDialog(this, bancoDados.listarExtrato(), "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, "Não foi feita nenhuma transferencia bancária ainda...", "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_exibirExtrato

    
    
    /*
        Método que contem a lógica de transferencia de dinheiro
    */
    private void transferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferirMouseClicked
        Conta transferidor = null;
        Conta destino = null;
        Double valor = 0.0;
        
        try {
            valor = Double.valueOf(valor_input.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Dados Inválidos", "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        try {
            transferidor = carregarTransferidor();
            destino = carregarDestino();
            
            bancoDados.transferir(valor, transferidor, destino);
            bancoDados.adicionaExtrato(transferidor, destino, valor);
            limpar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_transferirMouseClicked

    
    
    /*
        Método que cria uma conta nova no sistema
    */
    private void criarConta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarConta
        new CriarConta(bancoDados).setVisible(true);
    }//GEN-LAST:event_criarConta
    
    
    
    /*
        Método para carregar um objeto que irá realizar a transferencia de dinheiro
    */
    private Conta carregarTransferidor() throws Exception {
        String agencia = "";
        String numeroConta = "";
        
        if(suaAgencia_input.getText().equals("") || suaAgencia_input.getText() == null)
            throw new Exception("Dados inválidos");
        else
            agencia = suaAgencia_input.getText();
        
        
        if(suaConta_input.getText().equals("") || suaConta_input.getText() == null)
            throw new Exception("Dados inválidos");
        else
            numeroConta = suaConta_input.getText();
        
        
        Conta conta = null;
        try {
            conta = bancoDados.procurar(agencia, numeroConta);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
        
        return conta;
    }
    
    
    
    /*
        Método para carregar um objetos que irá receber a transferencia do dinheiro
    */
    private Conta carregarDestino() throws Exception {
        String agencia = "";
        String numeroConta = "";
        
        if(destinoAgencia_input.getText().equals("") || destinoAgencia_input.getText() == null)
            throw new Exception("Dados inválidos");
        else
            agencia = destinoAgencia_input.getText();
        
        
        if(destinoConta_input.getText().equals("") || destinoConta_input.getText() == null)
            throw new Exception("Dados inválidos");
        else
            numeroConta = destinoConta_input.getText();
        
        
        Conta conta = null;
        try {
            conta = bancoDados.procurar(agencia, numeroConta);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
        
        return conta;
    }
    
    
    
    /*
        Método para limpar os campos do formulário
    */
    private void limpar(){
        destinoAgencia_input.setText("");
        destinoConta_input.setText("");
    
        
        suaAgencia_input.setText("");
        suaConta_input.setText("");
        
        valor_input.setText("");
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Direita;
    private javax.swing.JPanel Esquerda;
    private javax.swing.JButton contas;
    private javax.swing.JButton criarConta;
    private javax.swing.JLabel destinoAgencia;
    private javax.swing.JFormattedTextField destinoAgencia_input;
    private javax.swing.JLabel destinoConta;
    private javax.swing.JFormattedTextField destinoConta_input;
    private javax.swing.JButton extrato;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel nomeBanco;
    private javax.swing.JButton sair;
    private javax.swing.JButton saldo;
    private javax.swing.JLabel suaAgencia;
    private javax.swing.JFormattedTextField suaAgencia_input;
    private javax.swing.JLabel suaConta;
    private javax.swing.JFormattedTextField suaConta_input;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton transferir;
    private javax.swing.JLabel valor;
    private javax.swing.JTextField valor_input;
    // End of variables declaration//GEN-END:variables
}
