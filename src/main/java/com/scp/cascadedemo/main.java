package com.scp.cascadedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = Hibernateutil.getSessionFactory().openSession();
		session.beginTransaction();

		Student st1 = new Student(10,"Megha", "Desai", null);

		Address ad1 = new Address(11,"Pune", "India", 100);
		Address ad2 = new Address(22,"Mumbai", "Uk", 200);
		Address ad3 = new Address(33,"goa", "Usa", 300);
		Address ad4 = new Address(44,"nagar", "bang", 400);
		Address ad5 = new Address(55,"latur", "Us", 500);
		List<Address> sList = new ArrayList<Address>();
		sList.add(ad1);
		sList.add(ad2);
		sList.add(ad3);
		sList.add(ad4);
		sList.add(ad5);
	

		st1.setAddress(sList);
		System.out.println("before delete");
		session.persist(st1);
	
		System.out.println("After delete");
		st1.getAddress().remove(ad4);
	

		session.flush();
		session.getTransaction().commit();
		session.close();
	}

}
