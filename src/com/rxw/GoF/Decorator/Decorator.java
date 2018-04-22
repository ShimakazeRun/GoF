package com.rxw.GoF.Decorator;

import java.util.ArrayList;

public class Decorator implements Work {

    private Work work;

    //额外增加的功能被打包在这个List中
    private ArrayList<String> others = new ArrayList<>();

    public Decorator(Work work) {
        this.work = work;
        others.add("挖坑");
        others.add("钉木板");
    }

    @Override
    public void insert() {
        newMethod();
    }

    // 在新方法中,我们在insert之前增加新的方法，这里次序先后由用户决定
    public void newMethod() {
        otherMethod();
        work.insert();
    }

    public void otherMethod() {
        for (String s : others) {
            System.out.println(s + "正在进行");
        }
    }
}
