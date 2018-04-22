package com.rxw.GoF.Composite;

import java.util.Iterator;

public abstract class Equipment {

    private String name;

    // 网络价格
    public abstract double netPrice();

    // 折扣价格
    public abstract double discountPrice();

    // 增加部件
    public boolean add(Equipment equipment) {
        return false;
    }

    // 删除部件
    public boolean remove(Equipment equipment) {
        return false;
    }

    // 提供一种用于访问组合体系的部件方法
    public Iterator iter() {
        return null;
    }

    public Equipment(final String name) {
        this.name = name;
    }
}
