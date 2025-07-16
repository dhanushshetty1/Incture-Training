package com.incture.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {
	public static void main(String [] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("Dhanush");
		s1.setCity("Mysore");
		
		Student s2 = new Student();
		s2.setId(200);
		s2.setName("Shetty");
		s2.setCity("Banglore");
		
		Student s3 = new Student();
		s3.setId(300);
		s3.setName("Vivek");
		s3.setCity("Mumbai");
		
		Account ac1 = new Account();
		ac1.setAcc_id(111);
		ac1.setAcc_type("Saving Account");
		
		Account ac2 = new Account();
		ac2.setAcc_id(222);
		ac2.setAcc_type("Current Account");
		
		Account ac3 = new Account();
		ac3.setAcc_id(333);
		ac3.setAcc_type("Fixed Deposit Account");
		
		s1.setAccount(ac1);
		s2.setAccount(ac2);
		s3.setAccount(ac3);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.save(ac1);
		session.save(ac2);
		session.save(ac3);
		
		tx.commit();
		
		
	}
}
