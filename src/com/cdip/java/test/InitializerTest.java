package com.cdip.java.test;

// Java code to illustrate order of
// execution of constructors, static
// and initialization blocks
public class InitializerTest {

    InitializerTest(int x) {
        System.out.println("ONE argument constructor");
    }

    InitializerTest() {
        System.out.println("No  argument constructor");
    }

    static {
        System.out.println("1st static init");
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        new InitializerTest();
        new InitializerTest(8);
    }
}
