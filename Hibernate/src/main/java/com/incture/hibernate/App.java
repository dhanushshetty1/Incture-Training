package com.incture.hibernate;

import java.sql.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) throws Exception {
        // Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Create and save employee using Hibernate
          Employee emp1 = new Employee();
//        emp1.setId(111);
//        emp1.setName("Nikhil");
//        emp1.setCity("Mysore");
        
        emp1.setId(222);
        emp1.setName("Dhanush");
        emp1.setCity("Mysore");
        emp1.setCountry("India");

        session.save(emp1);
        tx.commit();
        session.close();
    }
}