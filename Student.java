package zadachi_str_274;

import java.sql.SQLOutput;
import java.util.*;

public class Student implements Comparable <Student> {

    private String name;
    private int course;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo (Student o) {
        return this.course - o.course;
    }

    @Override
    public String toString () {
       return " Студент " + name + " курс-" + course;
    }

}