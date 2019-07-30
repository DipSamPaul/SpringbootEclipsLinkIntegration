package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Vendor;
@Repository
public interface VendorDao extends JpaRepository<Vendor, Integer> {
	
	/*
	 * public int saveAll(List<Vendor> vendors); public Vendor getvendor(int id);
	 * public String deteVendor(Vendor v);
	 */
	
	public Vendor findByVName(String vName);
}
