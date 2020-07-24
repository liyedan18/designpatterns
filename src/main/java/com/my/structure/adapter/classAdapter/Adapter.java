package com.my.structure.adapter.classAdapter;

public class Adapter extends TypeCImpl implements USB {
    @Override
    public void usbCharge() {
        System.out.println("类适配器：");
        System.out.println("把USB转换成TypeC来给手机充电。。。");
        typeCharge();
    }
}
