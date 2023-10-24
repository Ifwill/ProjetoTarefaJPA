package model;

public enum Prioridade {
	ALTA ("alta",1),
	MEDIA ("media",2),
	BAIXA ("baixa",3);
	
	private String descricao;
	private int id;
	
	private Prioridade(String descricao, int id){
		this.descricao = descricao;
		this.id =id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getId() {
		return id;
	}
	
}

