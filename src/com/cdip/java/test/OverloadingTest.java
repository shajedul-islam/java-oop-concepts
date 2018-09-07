package com.cdip.java.test;


import java.util.Collection;
import java.util.HashSet;

/*class ECommerce {
    public void makePayment(CreditCard creditCard) {}
    public void makePayment(DebitCard debitCard) {}
    public void makePayment(Bkash bkash) {}
    public void makePayment(Rocket rocket) {}

}

class ECommerceTest {
    public static void  main(String[] a) {
        ECommerce eCommerce = new ECommerce();
        //if user selects credit card
        eCommerce.makePayment(new CreditCard());

        //if user selects bkash
        eCommerce.makePayment(new Bkash());
    }
}*/


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
    public static Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
    //another overloaded method which takes HashSet argument which is sub class
    public static Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }

    public void doSomething() {
        OverloadingTest.sort(new HashSet());
    }

    public static void main(String[] a) {
        Collection c = new HashSet();
        OverloadingTest.sort(c);

        doSomething();
        //OverloadingTest ot = new OverloadingTest();
        //ot.sort(c);
    }
}
