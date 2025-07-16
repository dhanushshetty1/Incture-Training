package com.shetty.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration().configure("hib.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Project project1 = new Project("Web Development", "INCTURE");
        Project project2 = new Project("App Development", "INCTURE");

        Session session = factory.openSession();
        session.beginTransaction();
        session.save(project1);
        session.save(project2);
        session.getTransaction().commit();
        session.close();

        Employee employee = new Employee("Dhanush Shetty", "dhanushshetty106@gmail.com", "Developer");
        session = factory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();

        session = factory.openSession();
        EmployeeService service = new EmployeeService();
        service.assignProjectsToEmployee(session, employee, Arrays.asList(project1, project2));
        session.close();

        factory.close();

        System.out.println("Employee and project data saved successfully.");
    }
}
