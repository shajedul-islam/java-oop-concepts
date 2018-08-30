package com.cdip.java;

import com.cdip.java.model.CommissionEmployee;
import com.cdip.java.model.ContractualEmployee;
import com.cdip.java.model.FullTimeEmployee;
import com.cdip.java.model.PartTimeEmployee;

public class EmployeeApplication {
    public static void main(String[] a) {

        FullTimeEmployee john = new FullTimeEmployee();

        john.setId(1);
        john.setName("John");
        john.setBasic(15000);
        john.setHouseRent(5000);
        john.setConveyance(3000);

        john.calculateSalary();
    }

}
