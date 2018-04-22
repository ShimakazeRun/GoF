package com.rxw.GoF.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeEquipment extends Equipment {

    private int i = 0;

    // 定义一个Vector用来存放'儿子'
    private List<Equipment> equipment = new ArrayList<>();

    public CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public double netPrice() {
        double netPrice = 0.;
        Iterator iter = equipment.iterator();
        if (iter.hasNext()) {
            netPrice += ((Equipment)iter.next()).netPrice();
        }
        return netPrice;
    }

    @Override
    public double discountPrice() {
        double discountPrice = 0;
        Iterator iter = equipment.iterator();
        if (iter.hasNext()) {
            discountPrice += ((Equipment)iter.next()).discountPrice();
        }
        return discountPrice;
    }

    @Override
    public boolean add(Equipment equipment) {
        this.equipment.add(equipment);
        return true;
    }

    @Override
    public boolean remove(Equipment equipment) {
        this.equipment.remove(equipment);
        return true;
    }

    @Override
    public Iterator iter() {
        return equipment.iterator();
    }

}
