package com.my.observer;

import com.my.observer.observers.ItemsObserver;
import com.my.observer.observers.MonstersObserver;
import com.my.observer.observers.TrapObserver;
import com.my.observer.subObservers.Hero;
import com.my.observer.util.Constant;

public class Client {
    public static void main(String[] args) {
        Hero hero = new Hero();
        ItemsObserver itemsObserver = new ItemsObserver();
        MonstersObserver monstersObserver = new MonstersObserver();
        TrapObserver trapObserver = new TrapObserver();

        hero.addObserver(itemsObserver);
        hero.addObserver(monstersObserver);
        hero.addObserver(trapObserver);

        //英雄移动，遇到怪物了
        hero.move(Constant.MONSTERS_ID);
        //英雄移动，遇到陷阱了
        hero.move(Constant.TRAP_ID);
        //英雄移动，遇到道具了
        hero.move(Constant.ITEMS_ID);
    }
}
