package com.cdip.java.test;


import java.util.Collection;
import java.util.HashSet;

class ECommerce {
    /*public void makePayment(CreditCard creditCard) {}
    public void makePayment(DebitCard debitCard) {}
    public void makePayment(Bkash bkash) {}
    public void makePayment(Rocket rocket) {}*/
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

    //overloaded method takes Collection argument
    public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
    //another overloaded method which takes HashSet argument which is sub class
    public Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }

    public static void main(String[] a) {
        Collection c = new HashSet();
        OverloadingTest ot = new OverloadingTest();
        ot.sort(c);
    }
}
