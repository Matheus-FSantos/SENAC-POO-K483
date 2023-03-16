package io.github.ado02.domain.model;

import java.util.Objects;

import io.github.ado02.domain.model.enumeradores.Contrato;

public class Professor extends Pessoa {
	
	private Contrato contrato;
	private Integer aulasMensais;
	
	public Professor() {
		
	}
	
	public Professor(String nome, String email, Contrato contrato, Integer aulasMensais) throws Exception {
		super(nome, email);
		this.contrato = contrato;
		this.aulasMensais = aulasMensais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contrato);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return contrato == other.contrato;
	}
	
	@Override
	public String toString() {
		return "Professor [" + super.toString() + ", contrato=" + contrato + ", aulasMensais=" + aulasMensais + "]";
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public Integer getAulasMensais() {
		return aulasMensais;
	}

	public void setAulasMensais(Integer aulasMensais) {
		if(aulasMensais > 32)
			this.aulasMensais = 32;
		else
			this.aulasMensais = aulasMensais;
	}
}