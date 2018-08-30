package com.cdip.java.employee;

import com.cdip.java.employee.model.*;

public class EmployeeApplication {
    public static void main(String[] a) {

        FullTimeEmployee john = new FullTimeEmployee();
        john.setId(1);
        john.setName("John");
        john.setBasic(15000);
        john.setHouseRent(5000);
        john.setConveyance(3000);

        john.calculateSalary();


        CommissionEmployee bob = new CommissionEmployee();

        bob.setId(1);
        bob.setName("Bob");
        bob.setBasic(9000);
        bob.setHouseRent(5000);
        bob.setConveyance(3000);
        bob.setCommissionRate(5);

        bob.calculateSalary();



        Employee someone = new Employee();
        someone.setId(1);
        someone.setName("John");
        someone.setBasic(15000);
        someone.setHouseRent(5000);
        someone.setConveyance(3000);

        someone.calculateSalary();

    }

}
