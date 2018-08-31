package com.cdip.java.employee.model;

public class CommissionEmployee extends Employee {

    private int commissionRate;

    public int getCommissionRate() { return commissionRate; }
    public void setCommissionRate(int commissionRate) { this.commissionRate = commissionRate; }

    @Override
    public int calculateSalary() {
        int salary = super.calculateSalary();

        int salaryAfterCommission = salary + (salary * commissionRate / 100);
        System.out.println("Salary after commission: " + salaryAfterCommission);

        return salaryAfterCommission;
    }
}
