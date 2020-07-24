package com.my.structure.bridge.fruits.bag;

import com.my.structure.bridge.fruits.material.Material;

/**
 * 袋子大小
 */
public abstract class BagAbstract {
    //维护一个材料接口的引用，可以选择合适的材料
    //注意用protect不是private
    protected Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }

    //打包
    public abstract void pack();
}
