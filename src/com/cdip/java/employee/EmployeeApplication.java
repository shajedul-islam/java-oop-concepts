package com.cdip.java.employee;

import com.cdip.java.employee.model.*;

public class EmployeeApplication {
    public static void main(String[] a) {

        Employee john = new FullTimeEmployee();
        Employee ron = new PartTimeEmployee();
        Employee shaun = new ContractualEmployee();

        // more objects

        john.setId(1);
        john.setName("John");
        john.setBasic(15000);
        john.setHouseRent(5000);
        john.setConveyance(3000);

        ron.setId(2);
        ron.setName("John");
        ron.setBasic(12000);
        ron.setHouseRent(5000);
        ron.setConveyance(3000);

        shaun.setId(2);
        shaun.setName("John");
        shaun.setBasic(12000);
        shaun.setHouseRent(5000);
        shaun.setConveyance(3000);

        Employee bob = new CommissionEmployee();

        bob.setId(5);
        bob.setName("Bob");
        bob.setBasic(9000);
        bob.setHouseRent(5000);
        bob.setConveyance(3000);
        bob.setCommissionRate(5);

        Employee[] employeeArray = {john, ron, shaun, bob};

        for (Employee employee : employeeArray) {
            employee.calculateSalary();
        }

    }

}
