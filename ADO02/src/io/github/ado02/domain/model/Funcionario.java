package io.github.ado02.domain.model;

import java.util.Objects;

import io.github.ado02.domain.model.enumeradores.Contrato;

public class Funcionario extends Pessoa {
	
	private Contrato contrato;
	private String departamento;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String email, Contrato contrato, String departamento) throws Exception {
		super(nome, email);
		this.contrato = contrato;
		this.departamento = departamento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(contrato, departamento);
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
		Funcionario other = (Funcionario) obj;
		return contrato == other.contrato && Objects.equals(departamento, other.departamento);
	}
	
	@Override
	public String toString() {
		return "Funcionario [" + super.toString() + ", contrato=" + contrato + ", departamento=" + departamento + "]";
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}