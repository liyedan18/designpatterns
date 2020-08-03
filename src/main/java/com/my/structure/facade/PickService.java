package com.my.structure.facade;

import com.my.structure.bridge.fruits.bag.BagAbstract;
import com.my.structure.bridge.fruits.bag.BigBag;
import com.my.structure.bridge.fruits.material.Material;
import com.my.structure.bridge.fruits.material.Paper;

/**
 * 采摘水果服务
 */
public class PickService {
    public void doPick(){
        //用大袋
        BagAbstract bag = new BigBag();
        //用纸材料
        Material material = new Paper();
        bag.setMaterial(material);
        //开始采摘、打包
        bag.pack();
    }

    public void doOther(){
        System.out.println("其他一些服务");
    }
}
