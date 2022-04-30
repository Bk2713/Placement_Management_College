package tns.college.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {

 EntityManager entityManager;
 EntityManagerFactory entityManagerfactory;
 
 public JPAUtil() {
	 entityManagerfactory=Persistence.createEntityManagerFactory("JPA-PU");
 entityManager=entityManagerfactory.createEntityManager();
	}

public static EntityManager getEntityManager() {
	// TODO Auto-generated method stub
	return null;
}

}
