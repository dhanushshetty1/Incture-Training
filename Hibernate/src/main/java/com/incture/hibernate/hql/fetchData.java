package com.incture.hibernate.hql;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        String query = "from Employee where city =:x";

        Query q = session.createQuery(query);

        q.setFirstResult(2);
        q.setMaxResults(3);
        q.setParameter("x", "Pune");

        List<Employee> list = q.list();

        for (Employee emp : list) {
            System.out.println("ID :" + emp.getId() + " Name:" + emp.getName() + " city :" + emp.getCity() + " Salary :" + emp.getSalary());
        }

        tx.commit();
        session.close();
        factory.close();
    }
}
