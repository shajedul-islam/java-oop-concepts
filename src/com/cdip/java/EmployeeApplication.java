package com.cdip.java;

import com.cdip.java.model.ContractualEmployee;
import com.cdip.java.model.FullTimeEmployee;
import com.cdip.java.model.PartTimeEmployee;

public class EmployeeApplication {
    public static void main(String[] a) {

        FullTimeEmployee employeeWithDefaultValue = new FullTimeEmployee();

        System.out.println("Id: " + employeeWithDefaultValue.getId());
        System.out.println("Name: " + employeeWithDefaultValue.getName());
        System.out.println("Basic: " + employeeWithDefaultValue.getBasic());

        employeeWithDefaultValue.calculateSalary();

    }

}
