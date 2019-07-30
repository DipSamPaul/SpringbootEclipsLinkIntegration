package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.VendorDao;
import com.example.demo.dao.VendorDaoImpl;
import com.example.demo.entity.Vendor;

@Service
public class VendorServiceImpl implements VendorService {

	/*
	 * @Autowired VendorDaoImpl vendorDao;
	 */
	@PersistenceContext
	EntityManager entityManager;
	@Autowired
	VendorDao vendorDao;
	
	@Override
	public int saveVendors(List<Vendor> vendors) {
		vendorDao.saveAll(vendors);
		return vendors.size();
	}

	@Override
	public Vendor getVendor(int id) {
		return vendorDao.getOne(id);
	}

	@Override
	public String delteVendor(int id) {
		vendorDao.deleteById(id);
		return "1 row delleted";
	}

	public String getVenderName(int v) {
		return null/* vendorDao.getVendorName(v) */;
	}

	/*
	 * @Override public String delteVendor(Vendor v) { // TODO Auto-generated method
	 * stub return null; }
	 */

}
