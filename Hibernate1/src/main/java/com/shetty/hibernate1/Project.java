package com.shetty.hibernate1;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String projectName;
    private String clientName;

    @ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Set<Employee> employees = new HashSet<>();


    public Project() {}
    
    public Project(String projectName, String clientName) {
        this.projectName = projectName;
        this.clientName = clientName;
    }


    public int getId() {
    	return id;
    	}

    public String getProjectName() { 
    	return projectName; 
    	}
    public void setProjectName(String projectName) { 
    	this.projectName = projectName; 
    	}

    public String getClientName() { 
    	return clientName; 
    	}
    public void setClientName(String clientName) { 
    	this.clientName = clientName; 
    	}

    public Set<Employee> getEmployees() { 
    	return employees; 
    	}
    public void setEmployees(Set<Employee> employees) { 
    	this.employees = employees; 
    	}
}

