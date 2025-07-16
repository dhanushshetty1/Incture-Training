package com.shetty.hibernate1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class EmployeeService {

    public void assignProjectsToEmployee(Session session, Employee employee, List<Project> projects) {
        Transaction tx = session.beginTransaction();

        for (Project project : projects) {
            employee.addProject(project);
        }

        session.saveOrUpdate(employee);

        tx.commit();
    }
}
