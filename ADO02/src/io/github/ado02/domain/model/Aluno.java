package io.github.ado02.domain.model;

import java.util.Objects;

import io.github.ado02.domain.model.enumeradores.Matricula;

public class Aluno extends Pessoa {
	
	private Matricula matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String email, Matricula matricula) throws Exception {
		super(nome, email);
		this.matricula = matricula;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(matricula);
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
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}
	
	@Override
	public String toString() {
		return "Aluno [" + super.toString() + ", matricula=" + matricula + "]";
	}

	public Matricula getStatus() {
		return matricula;
	}

	public void setStatus(Matricula matricula) {
		this.matricula = matricula;
	}
}
