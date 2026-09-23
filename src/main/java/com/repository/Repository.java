package com.repository;

import org.hibernate.Transaction;

import com.Main.Main;
import com.entity.VehicalRegistration;

public class Repository {

	public void saveDate(VehicalRegistration vehical) {
		Transaction transactio = Main.session.beginTransaction();
		Main.session.persist(vehical);
		transactio.commit();
		System.out.println("-----------------------------------");
	}
	
	public void getId(int id) {
		
		VehicalRegistration vehica = Main.session.find(VehicalRegistration.class, id);
		System.out.println(vehica);
		System.out.println("------------------------------------");
	}
	
	public void upDate(int id) {
		Transaction transaction = Main.session.beginTransaction();
		VehicalRegistration vehica = Main.session.find(VehicalRegistration.class, id);
		vehica.setColor("green");
		transaction.commit();
		System.out.println("------------------------------");
	}
	
	public void delete(int id) {
	   Transaction transaction = Main.session.beginTransaction();
	   VehicalRegistration vehical = Main.session.find(VehicalRegistration.class, id);
	   
		Main.session.remove(vehical);
		transaction.commit();
		System.out.println("--------------------------------");
	}

}
