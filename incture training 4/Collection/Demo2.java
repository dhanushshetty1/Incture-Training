package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int rollno;
    int marks;
    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", marks=" + marks + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.marks > o.marks?-1:this.marks < o.marks?1:0;

    }

    

    
}

public class Demo2 {
    public static void main(String[] args) {
        List <Student> studs = new ArrayList();
        studs.add(new Student(1, 60));
        studs.add(new Student(2, 30));
        studs.add(new Student(3, 50));
        studs.add(new Student(4, 78));
        studs.add(new Student(5, 90));
        studs.add(new Student(6, 10));

        Collections.sort(studs);
        for(Student s : studs){
            System.out.println(s);
        }


    }
}

