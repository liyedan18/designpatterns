package com.my.action.observer.subObservers;

public class Hero extends SubObserver {
    //被观察者的行为方法，之后要调用通知方法
    public void move(int rangeId){
        notifyObserver(rangeId);
    }
}
