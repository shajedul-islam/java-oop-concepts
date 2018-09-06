package com.cdip.java.test;

public class DefaultValueTest {

    public static void main(String[] a) {
        MyClass myClass = new MyClass();
        System.out.println("x: " + myClass.getX());
    }
}

class MyClass {

    Integer x;

    int y; // default value 0

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
}
