package com.my.structure.bridge.fruits;

import com.my.structure.bridge.fruits.bag.BigBag;
import com.my.structure.bridge.fruits.material.Material;
import com.my.structure.bridge.fruits.material.Paper;

public class Client {
    public static void main(String[] args) {
        //选择材料
        Material material = new Paper();
        //选择大小
        BigBag bigBag = new BigBag();
        bigBag.setMaterial(material);
        //打包
        bigBag.pack();
    }
}
