package br.com.ado.model;

import java.util.Objects;

public class Cliente {
    private static Integer autoIncrement = 0;
    
    private Integer id;
    private String nome;
    private String senha;
    
    private String hierarquia;
    
    public Cliente(){}
    
    public Cliente(String nome, String senha){
        autoIncrement++;
        
        this.id = autoIncrement;
        this.nome = nome;
        this.senha = senha;
        
        if(this.id % 2 == 0)
            this.hierarquia = "VIP";
        else
            this.hierarquia = "Comum";
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", senha=" + senha + ", hierarquia=" + hierarquia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.id, other.id);
    }

    public Integer getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void updateNome(String nome){
        setNome(nome);
    }
    
    protected void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void updateSenha(String senha){
        setSenha(senha);
    }
    
    protected void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getHierarquia(){
        return hierarquia;
    }
    
    public void updateHierarquia(String hierarquia){
        setHierarquia(hierarquia);
    }
    
    protected void setHierarquia(String hierarquia){
        this.hierarquia = hierarquia;
    }
}