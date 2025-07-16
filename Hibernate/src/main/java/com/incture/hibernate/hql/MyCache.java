package com.incture.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyCache {
public static void name(String[] args) {
    Configuration cfg = new Configuration().configure();
    SessionFactory factory = cfg.buildSessionFactory();
    Session session1 = factory.openSession();
    Session session2 = factory.openSession();
    
    Employee emp1 = session1.get(Employee.class, 222);
    System.out.println(emp1.getName()+" "+emp1.getSalary());
    
    //session1.clear();
    
    System.out.println("after sometime");
    
    Employee emp2 = session1.get(Employee.class, 222);
    System.out.println(emp2.getName()+" "+emp2.getSalary());
    
}
}
