package model;

public enum Estado {
	AFAZER("A fazer"),
	ANDAMENTO("Em andamento"),
	CONCLUIDA("Concluida");
	
	private String descricao;
	
	private Estado(String descricao) {
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

}
