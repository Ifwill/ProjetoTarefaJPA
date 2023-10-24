package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefa;

public class TarefaDAO {
	private  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
	 private EntityManager entityManager;
	 
	 public TarefaDAO() {
		 entityManager = entityManagerFactory.createEntityManager();
	 }
	 
	 public void adicionarTarefa(Tarefa tarefa) {
		 entityManager.getTransaction().begin();
		 entityManager.persist(tarefa);
		 entityManager.getTransaction().commit();
	 }
	
}
