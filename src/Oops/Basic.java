package Oops;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        Student student1 = new Student("Aravind Samy",1234,98.0f);
        System.out.println(student1.getName());
    }
}

class Student{
    long rno;
    String name;
    float marks;

    public String getName() {
        return name;
    }

    Student (String Fullname, long rollno, float mark) {
        name = Fullname;
        rno = rollno;
        marks = mark;
    }
}