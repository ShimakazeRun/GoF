package com.rxw.GoF.Composite;

public class Test {

    public static void main(String[] args) {
        Chassis chassis = new Chassis("Pc Chassis");
        chassis.add(new Disk("10GB"));
    }
}
