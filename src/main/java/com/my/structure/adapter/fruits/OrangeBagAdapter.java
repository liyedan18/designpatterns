package com.my.structure.adapter.fruits;

import com.my.structure.entity.AppleBag;
import com.my.structure.entity.OrangeBag;

/**
 * 已经有了橙子和苹果箱子。
 * 把橙子装进苹果箱子里
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

    public OrangeBagAdapter(AppleBag appleBag){
        this.appleBag = appleBag;
    }

    @Override
    public void pack(){
        System.out.println("橙子箱子用完了。。。现在用其他的箱子打包。。。");
        appleBag.pack();
    }

}
