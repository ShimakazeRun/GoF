package com.rxw.GoF.Composite;

public class Disk extends Equipment {

    @Override
    public double netPrice() {
        return 1.;
    }

    @Override
    public double discountPrice() {
        return .5;
    }

    public Disk(String name) {
        super(name);
    }

}
