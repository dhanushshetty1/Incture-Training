package com.incture.hibernate.manyToMany;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class retrieveData {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hib.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, 101);
        System.out.println("Student: " + s.getName());
        for (Course c : s.getCourses()) {
            System.out.println("Course: " + c.getName());
        }

        tx.commit();
        session.close();
        factory.close();
    }
}
