package com.cdip.java;

import com.cdip.java.model.ContractualEmployee;
import com.cdip.java.model.FullTimeEmployee;
import com.cdip.java.model.PartTimeEmployee;

public class EmployeeApplication {

    public static void main(String[] a) {
        ContractualEmployee contractualEmployee = new ContractualEmployee(
                1, "Johnny", 15000, 5000, 3000);
        contractualEmployee.calculateSalary();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(
                2, "Rony", 14000, 4000, 2000);
        partTimeEmployee.calculateSalary();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(
                3, "Bonny", 13000, 3500, 2500);
        fullTimeEmployee.calculateSalary();

    }
}
