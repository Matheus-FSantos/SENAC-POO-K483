package io.github.ado02.domain.model.enumeradores;

public enum Matricula {
	INATIVA (0),
	PENDENTE (1),
	ATIVA (2);
	
	private Integer codigo;
	
	private Matricula(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public static Matricula valueOf(Integer codigo) {
		for(Matricula matricula : Matricula.values()) {
			if(matricula.getCodigo() == codigo)
				return matricula;
		}
		
		throw new IllegalArgumentException("Invalid Code");
	}
}