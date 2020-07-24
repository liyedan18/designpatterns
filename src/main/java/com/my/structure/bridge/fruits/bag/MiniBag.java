package com.my.structure.bridge.fruits.bag;

public class MiniBag extends BagAbstract {
    @Override
    public void pack() {
        System.out.println("用mini袋子。。。");
        this.material.draw();
        System.out.println("打包完了。。。");
    }
}
