package model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarefa")
public class Tarefa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_tarefa")
	private Integer id;
	
	@Column(name = "Titulo_tarefa")
	private String titulo;
	
	@Column(name = "descricao_tarefa")
	private String descricao;
	
	@Column(name ="data_criacao_tarefa")
	private String data_Criacao;
	
	@Column(name = "data_vencimento_tarefa")
	private String data_Vencimento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "prioridade_tarefa")
	private Prioridade prioridade;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "estado_tarefa")
	private Estado estado;
	
	public Tarefa() {
	}
	
	
	public Tarefa(Integer id, String titulo, String descricao, String data_Criacao, String data_Vencimento,
			Prioridade prioridade, Estado estado) {
		this.id = null;
		this.titulo = titulo;
		this.descricao = descricao;
		this.data_Criacao = data_Criacao;
		this.data_Vencimento = data_Vencimento;
		this.prioridade = prioridade;
		this.estado = estado;
	}




	public Integer getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData_Criacao() {
		return data_Criacao;
	}
	public void setData_Criacao(String data_Criacao) {
		this.data_Criacao = data_Criacao;
	}
	public String getData_Vencimento() {
		return data_Vencimento;
	}
	public void setData_Vencimento(String data_Vencimento) {
		this.data_Vencimento = data_Vencimento;
	}
	public Prioridade getPrioridade() {
		return prioridade;
	}
	
	public Estado getEstado() {
		return estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
	
	
	
	

	

}
