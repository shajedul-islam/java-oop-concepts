package com.cdip.java.test;


class ECommerce {
    public void makePayment(CreditCard creditCard) {}
    public void makePayment(DebitCard debitCard) {}
    public void makePayment(Bkash bkash) {}
    public void makePayment(Rocket rocket) {}
}


abstract class Vehicle
{
    abstract void search(int number);
    abstract void search(String ownerName);
}
class Pulsar extends Vehicle
{
    void search(int number) {
        //search by number
    }
    void search(String ownerName) {
        //search by ownerName
    }
}
class RangeRover extends Vehicle
{
    void search(int number) {
        //search by number
    }
    void search(String ownerName) {
        //search by ownerName
    }
}

public class OverloadingTest {
}
