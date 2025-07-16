package com.incture.hibernate.manyToMany;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

//import java.util.*;

public class insertData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Course c1 = new Course();
        c1.setId(1);
        c1.setName("Math");

        Course c2 = new Course();
        c2.setId(2);
        c2.setName("Science");

        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Aditya");

        Student s2 = new Student();
        s2.setId(102);
        s2.setName("Sinchana");

        // Linking students to courses
        s1.getCourses().add(c1);
        s1.getCourses().add(c2);

        s2.getCourses().add(c1); // only math

        // Linking courses to students
        c1.getStudents().add(s1);
        c1.getStudents().add(s2);
        c2.getStudents().add(s1);

        session.save(s1);
        session.save(s2);
        session.save(c1);
        session.save(c2);

        tx.commit();
        session.close();
        factory.close();
    }
}
