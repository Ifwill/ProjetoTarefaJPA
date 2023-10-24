package controller;

import dao.TarefaDAO;
import model.Estado;
import model.Tarefa;
import view.TarefaView;

public class TarefaController {
	private TarefaView tarefaView;
	private TarefaDAO tarefaDAO;
	
	public TarefaController() {
		tarefaView = new TarefaView();
		tarefaDAO = new TarefaDAO();
	}
	
	public void start() {
		int op = 0;
		
		do {
			
			switch(op = tarefaView.menu()) {
			case 1:
				adicionarTarefa();
			}
			
		}while(op != 0);
	}
	
	
	public void adicionarTarefa() {
		Estado estado = null;
		Tarefa tarefa = new Tarefa(null,tarefaView.getTitulo(),tarefaView.getDescricao(),tarefaView.getDataCriacao(),tarefaView.getDatavencimento(),tarefaView.menuP(),estado.AFAZER);
		tarefaDAO.adicionarTarefa(tarefa);
	}
	

}
