package com.my.adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        TypeC typeC = new TypeCImpl();
        //传入被适配对象
        ObjectAdapter adapter = new ObjectAdapter(typeC);
        adapter.usbCharge();
    }
}
