package com.my.structure.adapter.objectAdapter;

/**
 * 适配器类，包含一个被适配类的引用。
 */
public class ObjectAdapter implements USB {
    private TypeC typeC;

    public ObjectAdapter(TypeC typeC){
        this.typeC = typeC;
    }

    @Override
    public void usbCharge() {
        System.out.println("对象适配器：");
        System.out.println("把USB转换成TypeC来给手机充电。。。");
        this.typeC.typeCharge();
    }
}
