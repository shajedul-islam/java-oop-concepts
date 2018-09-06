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



public class OverridingTest {
}

