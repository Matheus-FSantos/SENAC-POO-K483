package io.github.ado02.domain.model.enumeradores;

public enum Contrato {
	INATIVA (0),
	ATIVA (2);
	
	private Integer codigo;
	
	private Contrato(Integer codigo) {
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