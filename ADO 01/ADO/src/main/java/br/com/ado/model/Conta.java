package br.com.ado.model;

import java.util.Objects;

public class Conta {
    private static Integer autoIncrement = 0;
    
    private Integer numeroConta;
    private Cliente cliente;
    
    public Conta(){}
    
    public Conta(Cliente cliente){
        autoIncrement++;
        
        this.numeroConta = autoIncrement;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", cliente=" + cliente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.numeroConta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Conta other = (Conta) obj;
        return Objects.equals(this.numeroConta, other.numeroConta);
    }
    
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void updateNumeroConta(Integer numeroConta){
        setNumeroConta(numeroConta);
    }
    
    protected void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void updateCliente(Cliente cliente){
        setCliente(cliente);
    }
    
    protected void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}