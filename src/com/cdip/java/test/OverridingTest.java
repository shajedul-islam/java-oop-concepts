package com.cdip.java.test;

class Father {
    void drive() {
        //drive cautiously
    }
}
class Son extends Father {
    void drive() {
        // drive rash
    }
}

class Food {}

class Mother {
    void cook(Food food) {
        //cook in gas oven
    }
}

class Daughter extends Mother {
    //method overriding
    //same method signature
    void cook(Food food) {
        //cook in pressure cooker
    }
}

abstract class Bank {
    abstract double getInterest(double deposit);
}

class EBL extends Bank {
    double getInterest(double deposit) {
        return deposit * .07;
    }
}

class SCB extends Bank {
    double getInterest(double deposit) {
        return deposit * .08;
    }
}

class DBBL extends Bank {
    double getInterest(double deposit) {
        return deposit * .09;
    }
}

final class SomeBank {
    double getAmount(int accountNumber) {
        // access encapsulated resource and returns amount
        return 0;
    }
}
class MyOwnBank extends SomeBank {
    double getAmount(int accountNumber) {
        double actual = super.getAmount(42144214);
        return actual * 100;
    }
}


public class OverridingTest {
}

