package com.my.observer.observers;

import com.my.observer.util.Constant;

public class TrapObserver implements Observer {
    @Override
    public void update() {
        System.out.println("掉入陷阱了！！我完了。。。");
    }

    @Override
    public boolean isInRange(int rangeId) {
        return rangeId == Constant.TRAP_ID;
    }
}
