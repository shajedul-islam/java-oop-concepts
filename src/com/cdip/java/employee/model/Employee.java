package com.cdip.java.employee.model;

public abstract class Employee {

    private int id;
    private String name;
    private int basic;
    private int houseRent;
    private int conveyance;

    public int calculateSalary() {
        int salary = basic + houseRent + conveyance;
        System.out.println(name + "'s gross salary: " + salary);
        return salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBasic() { return basic; }
    public void setBasic(int basic) {
        if (basic > 0) {
            this.basic = basic;
        } else {
            // Alert or notify with proper message
        }
    }

    public int getHouseRent() { return houseRent; }
    public void setHouseRent(int houseRent) { this.houseRent = houseRent; }

    public int getConveyance() { return conveyance; }
    public void setConveyance(int conveyance) { this.conveyance = conveyance; }

    public void setCommissionRate(int commissionRate) { }
}
