package com.abc.reactiveexample.programs;

public class CTest implements  A, B{


    @Override
    public void print() {
        System.out.println("C print");
    }

    public static void main(String[] args) {
        CTest cTest = new CTest();
        cTest.print();
    }
}
