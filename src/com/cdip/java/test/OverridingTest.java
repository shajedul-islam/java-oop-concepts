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


public class OverridingTest {
}

