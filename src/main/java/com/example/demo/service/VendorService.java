package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Vendor;

public interface VendorService {
	public int saveVendors(List<Vendor> vendor);
	
	/*
	 * public Vendor getVendor(int id); public String delteVendor(Vendor v);
	 */

	Vendor getVendor(int id);

	//String delteVendor(Vendor v);

	String delteVendor(int id);
}
