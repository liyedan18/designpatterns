package com.my.observer.observers;

/**
 * 观察者接口：对事件做出响应
 * 所有需要做出响应的观察者都要继承此接口（怪物、陷阱、道具）
 */
public interface Observer {
    //事件响应方法
    void update();
    //根据rangeId判断是否在自己的范围内
    boolean isInRange(int rangeId);
}
