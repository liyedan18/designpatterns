package com.my.action.observer.subObservers;

import com.my.action.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者抽象类
 * 维护观察者列表，可以添加、删除观察者
 * 可以调用通知观察者
 */
public abstract class SubObserver {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    //通知观察者做响应处理
    public void notifyObserver(int rangeId) {
        for (Observer obs : this.observers) {
            //在势力范围内，则作出响应
            if (obs.isInRange(rangeId)) {
                obs.update();
            }
        }
    }
}
