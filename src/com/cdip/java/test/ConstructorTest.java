package com.cdip.java.test;


abstract class Employee {

    static int noOfEmployees;


    //TODO: What happens when we declare a constructor in an abstract class?
    public Employee() {
        noOfEmployees++;
        System.out.println("super class: " + noOfEmployees);
    }


}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee() {
        super();
        System.out.println("sub class");
    }

    /*public FullTimeEmployee(int x) {
        System.out.println("sub class with argument");
    }*/
}
//TODO: demonstrate execution of blocks
public class ConstructorTest {
    public static void main(String[] a) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee();
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee();

        //FullTimeEmployee subClass1 = new FullTimeEmployee(5);
    }
}
