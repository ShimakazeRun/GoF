package com.rxw.GoF.Composite;

public class Chassis extends CompositeEquipment {

    public Chassis(String name) {
        super(name);
    }

    @Override
    public double netPrice() {
        return 1. + super.netPrice();
    }

    @Override
    public double discountPrice() {
        return 1. + super.discountPrice();
    }
}
