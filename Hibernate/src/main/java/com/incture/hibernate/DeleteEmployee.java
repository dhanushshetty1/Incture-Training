package com.incture.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();//connect db
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();//only one factroy h
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = session.get(Employee.class, 111);
		session.remove(emp);
		tx.commit();
	}

}
