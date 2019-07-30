package com.example.demo.config;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class EntityManagerFactoryBuilderRe {
	
	public EntityManager getentirtyManager() {
		javax.persistence.EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
