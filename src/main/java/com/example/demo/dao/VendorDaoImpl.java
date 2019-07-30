package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.config.EntityManagerFactoryBuilderRe;
import com.example.demo.entity.Vendor;
//@Repository
public class VendorDaoImpl {
/*	private final String GET_VENDOR_NAME_SQL=" vName FROM Vendor v WHERE v.vId=?";
	private EntityManager getEntityManager() {
		EntityManagerFactoryBuilderRe entityManagerFactory = new EntityManagerFactoryBuilderRe();
		EntityManager em = entityManagerFactory.getentirtyManager();
		return em;
	}

	public int saveAll(List<Vendor> vendors) {
		EntityManager em = getEntityManager();
		em.getTransaction().begin();
		for (Vendor v : vendors) {
			em.persist(v);
		}
		em.getTransaction().commit();
		return vendors.size();
	}

	public Vendor getvendor(int id) {
		EntityManager em = getEntityManager();
		Vendor v = em.find(Vendor.class, id);
		System.out.println(v);
		return v;
	}

	public String deteVendor(int id) {
		EntityManager em = getEntityManager();
		boolean trFlag = true;
		try {
			Vendor v2 = em.getReference(Vendor.class, id);
			em.getTransaction().begin();
			em.remove(v2);
			System.out.println("id deletd " + v2.getvId());
			trFlag = true;
		} catch (Exception e) {
			System.err.println(e.fillInStackTrace());
			trFlag = false;
		}
		if (trFlag) {
			System.out.println("commiting");
			em.getTransaction().commit();
		} else {
			System.out.println("roll back!!");
			em.getTransaction().rollback();
		}
		return "deleted 1 row";
	}
	public String getVendorName(int id) {
		EntityManager em = getEntityManager();
		Query q=em.createNativeQuery("SELECT V_NAME FROM user_service.vendors WHERE V_ID=?");
		q.setParameter(1, id);
		String name=(String)q.getSingleResult();
		return name;
	}*/
}
