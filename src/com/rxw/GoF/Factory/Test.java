package com.rxw.GoF.Factory;

public class Test {
    public static void main(String[] args) {
        /*
        Sample s1 = new Sample1();
        Sample s2 = new Sample2();
        */
        Sample s1 = Factory.create(1);
    }
}
