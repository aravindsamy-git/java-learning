package Oops;

import java.util.Arrays;

public class Basic {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Aravind";
        student1.rno = 123456789;
        student1.marks = 98;

        System.out.println(student1.getName());
    }

}

class Student{
    int rno;
    String name;
    float marks;

    public String getName() {
        return name;
    }
}