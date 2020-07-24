package com.my.structure.adapter.fruits;

import com.my.structure.entity.AppleBag;

public class Client {
    public static void main(String[] args) {
        OrangeBagAdapter adapter = new OrangeBagAdapter(new AppleBag());
        adapter.pack();
    }
}
