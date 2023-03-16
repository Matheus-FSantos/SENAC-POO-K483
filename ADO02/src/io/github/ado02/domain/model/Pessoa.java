package io.github.ado02.domain.model;

import java.util.Objects;

public class Pessoa {
	private String nome;
	private String email;
	
	private String mensagem;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String email) throws Exception {
		this.nome = nome;
		this.setEmail(email);
		this.mensagem = null;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", mensagem=" + mensagem + "]";
	}

	public String getNome() {
		return nome;
	}
	
	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	protected void setEmail(String email) throws Exception {
		if(!email.contains("@gmail.com"))
			throw new Exception("Email inválido");
		
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	protected void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void updateMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}