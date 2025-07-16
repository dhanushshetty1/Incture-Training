package com.incture.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertData {
	public static void name(String []a) {
		 Configuration cfg = new Configuration().configure();
	     SessionFactory factory = cfg.buildSessionFactory();
	     Session session = factory.openSession();
	     Transaction tx = session.beginTransaction();
	     
	     Employee emp1 = new Employee();
	     emp1.setId(111);
	     emp1.setName("Nishchal");
	     emp1.setCity("Delhi");
	     emp1.setSalary(5000);
		
	     Employee emp2 = new Employee();
	     emp2.setId(222);
	     emp2.setName("Vivek");
	     emp2.setCity("Mumbai");
	     emp2.setSalary(10000);
	     
	     session.save(emp1);
	     session.save(emp2);
		
	}
     
}
