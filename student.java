package com.company;
import java.util.*;

public class student {
    String name;
    int rollno;

    student(String name,int rollno)

    {
        this.name =  name;
        this.rollno = rollno;

    }

    public static void main(String[] args) {

        student s1=new student("sahil",101);
        student s2=new student("kunal" ,102);

        System.out.println(s1.name);
        System.out.println(s1.rollno);

        System.out.println(s2.name);


}
}
