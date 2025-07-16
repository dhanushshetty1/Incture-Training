package com.incture.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveData {
	public static void main(String [] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp1 = session.get(Employee.class, 444);
		
		//Employee emp1 = session.load(Employee.class, 444); 
		System.out.println(emp1);
		System.out.println("Id :"+emp1.getId());
		System.out.println("Name :"+emp1.getName());
		System.out.println("City :"+emp1.getCity());
	}
}
