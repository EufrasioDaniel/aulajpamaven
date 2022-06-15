package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
/* SALVANDO NO BANCO */

//		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //Advem da persistence unit name do persistence.xml
//		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin(); //Como nao é simples leitura no banco de dados, precisa chamar transação
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		
//		em.getTransaction().commit(); //Confirma alterações
//		System.out.println("Pronto!");
//		
//		em.close();
//		emf.close();
		

/* RECUPERANDO DO BANCO DE DADOS */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); //Advem da persistence unit name do persistence.xml
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
