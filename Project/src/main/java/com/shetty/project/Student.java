package com.shetty.project;
import javax.persistence.Column;
import java.util.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private int id;

    private String name;
    private int age;

    @ManyToMany
    @JoinTable(
        name = "student_courses",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();

    // Getters, setters, constructors
}