package com.my.structure.bridge.fruits.bag;

public class SmallBag extends BagAbstract {
    @Override
    public void pack() {
        System.out.println("用小号袋子。。。");
        this.material.draw();
        System.out.println("打包完了。。。");
    }
}
