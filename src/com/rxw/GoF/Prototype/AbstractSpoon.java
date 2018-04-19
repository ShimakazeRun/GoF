package com.rxw.GoF.Prototype;

public class AbstractSpoon implements Cloneable{
    String spoonName;

    public void setSpoonName(String spoonName) {
        this.spoonName = spoonName;
    }

    public String getSpoonName() {
        return this.spoonName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
