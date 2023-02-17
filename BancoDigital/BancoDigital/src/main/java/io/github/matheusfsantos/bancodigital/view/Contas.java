package io.github.matheusfsantos.bancodigital.view;

import io.github.matheusfsantos.bancodigital.model.BancoDados;
import io.github.matheusfsantos.bancodigital.model.Conta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Contas extends javax.swing.JFrame {

    private static BancoDados bancoDados = null;
    
    public Contas(BancoDados bancoDados) {
        if(bancoDados != null){
            initComponents();
            Contas.bancoDados = bancoDados;
            this.carregarTabela();
        } else {
            this.dispose();
            try {
                new Principal().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void carregarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        
        
        Conta contas [] = bancoDados.listar();
        
        for(Conta conta: contas){
            if(conta != null) {
                Object objeto[] = {conta.getAgencia(), conta.getConta(), conta.getSaldo()};
                modelo.addRow(objeto);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTabela = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Contas");
        setResizable(false);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Agencia", "Conta", "Saldo"
            }
        ));
        scrollTabela.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contas(bancoDados).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollTabela;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
