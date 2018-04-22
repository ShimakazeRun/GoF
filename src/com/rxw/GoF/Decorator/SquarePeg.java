package com.rxw.GoF.Decorator;

public class SquarePeg implements Work {
    @Override
    public void insert() {
        System.out.println("方形柱插入");
    }
}
