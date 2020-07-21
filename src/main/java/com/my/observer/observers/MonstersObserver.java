package com.my.observer.observers;

import com.my.observer.util.Constant;

/**
 * 怪物观察者
 */
public class MonstersObserver implements Observer {
    @Override
    public void update() {
        System.out.println("遇到怪物了，开打！！！");
    }

    @Override
    public boolean isInRange(int rangeId) {
        return rangeId == Constant.MONSTERS_ID;
    }
}
