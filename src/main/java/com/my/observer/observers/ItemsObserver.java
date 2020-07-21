package com.my.observer.observers;

import com.my.observer.util.Constant;

public class ItemsObserver implements Observer {
    @Override
    public void update() {
        System.out.println("捡到了道具啦！！");
    }

    @Override
    public boolean isInRange(int rangeId) {
        return rangeId == Constant.ITEMS_ID;
    }
}
