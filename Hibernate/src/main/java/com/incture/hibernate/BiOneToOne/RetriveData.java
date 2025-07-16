package com.incture.hibernate.BiOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class RetriveData {
	public static void main(String [] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = session.get(Student.class, 300);
		
		/*System.out.println("Student id : " +st.getId());
		System.out.println("name : "+st.getName());
		System.out.println("city : "+st.getCity());
		System.out.println("Student Account ID : "+st.getAccount().getAcc_id());
		System.out.println("Student Account Type : "+st.getAccount().getAcc_type());*/
		
		
		Account ac = session.get(Account.class, 111);
		System.out.println("Student Account id : " +ac.getAcc_id());
		System.out.println("Student Account Type : "+ac.getAcc_type());
		System.out.println("Student ID : "+ac.getStudent().getId());
		System.out.println("Student City : "+ac.getStudent().getCity());
		System.out.println("Student Name : "+ac.getStudent().getName());
		
	}
}
