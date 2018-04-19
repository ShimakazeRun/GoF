package com.rxw.GoF.Factory;

public class Factory {
    public static Sample create(int which) {
        if (which == 1) {
            return new Sample1();
        }
        if (which == 2) {
            return new Sample2();
        }
        return null;
    }
}
