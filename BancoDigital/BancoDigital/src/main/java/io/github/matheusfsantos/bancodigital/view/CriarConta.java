/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.matheusfsantos.bancodigital.view;

import io.github.matheusfsantos.bancodigital.model.BancoDados;
import io.github.matheusfsantos.bancodigital.model.Conta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class CriarConta extends javax.swing.JFrame {
    
    private static BancoDados bancoDados;
    
    public CriarConta(BancoDados bancoDados) {
        if(bancoDados != null) {
            initComponents();
            CriarConta.bancoDados = bancoDados;
        } else {
            this.dispose();
            try {
                new Principal().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(CriarConta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Div = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        agencia = new javax.swing.JLabel();
        input_agencia = new javax.swing.JFormattedTextField();
        conta = new javax.swing.JLabel();
        input_conta = new javax.swing.JFormattedTextField();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crie sua conta");
        setResizable(false);

        Div.setBackground(new java.awt.Color(102, 0, 153));

        Titulo.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setIcon(new javax.swing.ImageIcon("/home/matheus/Área de Trabalho/bancario.png")); // NOI18N
        Titulo.setText("  MBank");

        agencia.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        agencia.setForeground(new java.awt.Color(255, 255, 255));
        agencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agencia.setText("Informe a agencia");

        try {
            input_agencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        input_agencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_agencia.setText("");

        conta.setFont(new java.awt.Font("Ubuntu Condensed", 0, 18)); // NOI18N
        conta.setForeground(new java.awt.Color(255, 255, 255));
        conta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conta.setText("Informe a conta");

        try {
            input_conta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        input_conta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_conta.setText("");

        salvar.setText("Salvar");
        salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarConta(evt);
            }
        });

        javax.swing.GroupLayout DivLayout = new javax.swing.GroupLayout(Div);
        Div.setLayout(DivLayout);
        DivLayout.setHorizontalGroup(
            DivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DivLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DivLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_agencia)
                    .addComponent(input_conta)
                    .addComponent(conta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agencia, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(76, 76, 76))
        );
        DivLayout.setVerticalGroup(
            DivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DivLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(agencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_agencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(conta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarConta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarConta
        Conta conta = null;
        
        String agencia = "";
        String numeroConta = "";
        
        if(input_agencia.getText().isEmpty() || input_agencia.getText().equals("   ")){
            JOptionPane.showMessageDialog(this, "Impossivel adicionar a conta", "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (input_conta.getText().isEmpty() || input_conta.getText().equals("       ")){
            JOptionPane.showMessageDialog(this, "Impossivel adicionar a conta", "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            agencia = input_agencia.getText();
            numeroConta = input_conta.getText();
        }
        
        
        boolean teste = bancoDados.verifica(agencia, numeroConta);
        
        
        if(teste){
            JOptionPane.showMessageDialog(this, "Impossivel adicionar a conta", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                conta = new Conta(numeroConta,agencia);
                bancoDados.adiciona(conta);
                JOptionPane.showMessageDialog(this, "Conta adicionada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(CriarConta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_salvarConta
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarConta(bancoDados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Div;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel agencia;
    private javax.swing.JLabel conta;
    private javax.swing.JFormattedTextField input_agencia;
    private javax.swing.JFormattedTextField input_conta;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
