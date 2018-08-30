package com.cdip.java.model;

public class FullTimeEmployee {

    public int id;
    public String name;
    public int basic;
    public int houseRent;
    public int conveyance;

    public FullTimeEmployee(int id, String name, int basic, int houseRent, int conveyance) {
        this.id = id;
        this.name = name;
        this.basic = basic;
        this.houseRent = houseRent;
        this.conveyance = conveyance;
    }

    public int calculateSalary() {
        int salary = basic + houseRent + conveyance;
        System.out.println(name + "'s salary: " + salary);
        return salary;
    }
}
