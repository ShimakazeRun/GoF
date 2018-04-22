package com.rxw.GoF.Decorator;

public class Test {
    public static void main(String[] args) {
        Work squarePeg = new SquarePeg();
        Work decorator = new Decorator(squarePeg);
        decorator.insert();
    }
}
