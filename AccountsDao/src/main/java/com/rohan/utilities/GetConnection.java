package com.rohan.utilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {
	
	
	public static EntityManager get() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
		
		EntityManager em = emf.createEntityManager();
		
		
		return em;
		
	}
	
	
}
