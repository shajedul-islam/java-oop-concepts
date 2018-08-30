package com.cdip.java;

import com.cdip.java.model.ContractualEmployee;
import com.cdip.java.model.FullTimeEmployee;
import com.cdip.java.model.PartTimeEmployee;

public class EmployeeApplication {
    public static void main(String[] a) {

        FullTimeEmployee fullTimeEmployeeWithNegativeSalary = new FullTimeEmployee();
        fullTimeEmployeeWithNegativeSalary.setId(1);
        fullTimeEmployeeWithNegativeSalary.setName("Mr. Negative");
        fullTimeEmployeeWithNegativeSalary.setBasic(-13000);
        fullTimeEmployeeWithNegativeSalary.setHouseRent(5000);
        fullTimeEmployeeWithNegativeSalary.setConveyance(3000);

        fullTimeEmployeeWithNegativeSalary.calculateSalary();

    }

}
