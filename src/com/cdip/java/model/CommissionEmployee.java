package com.cdip.java.model;

public class CommissionEmployee extends Employee {

    private int commissionRate;

    public int getCommissionRate() { return commissionRate; }
    public void setCommissionRate(int commissionRate) { this.commissionRate = commissionRate; }

    @Override
    public int calculateSalary() {
        int salary = basic + houseRent + conveyance;
        System.out.println(name + "'s gross salary: " + salary);

        int salaryAfterCommission = salary + (salary * commissionRate / 100);
        System.out.println("Salary after commission: " + salaryAfterCommission);

        return salaryAfterCommission;
    }
}
