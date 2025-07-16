package com.incture.hibernate.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.incture.hibernate.Employee;

public class RetriveData {
	public static void main(String [] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = session.get(Student.class, 100);
		
		System.out.println("Student id : " +st.getId());
		System.out.println("name : "+st.getName());
		System.out.println("city : "+st.getCity());
	}
}
