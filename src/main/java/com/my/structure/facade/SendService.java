package com.my.structure.facade;

import com.alibaba.fastjson.JSON;
import com.my.structure.composite.AddrNode;

/**
 * 物流服务
 */
public class SendService {
    public void doSend(){
        AddrNode rootNode = new AddrNode("根");

        //一级目录：省
        AddrNode beiJing = new AddrNode("北京");
        AddrNode jiangSu = new AddrNode("江苏省");
        rootNode.addChildNode(beiJing);
        rootNode.addChildNode(jiangSu);

        //二级目录：市
        beiJing.addChildNode(new AddrNode("海淀区"));
        beiJing.addChildNode(new AddrNode("朝阳区"));
        AddrNode nanJing = new AddrNode("南京市");
        AddrNode suZhou = new AddrNode("苏州市");
        jiangSu.addChildNode(nanJing);
        jiangSu.addChildNode(suZhou);

        //三级目录：区
        nanJing.addChildNode(new AddrNode("玄武区"));
        suZhou.addChildNode(new AddrNode("工业园区"));
        suZhou.addChildNode(new AddrNode("吴江区"));

        System.out.println("请选择目的地："+JSON.toJSON(rootNode));
        System.out.println("选择的地址是：江苏省-苏州市-工业园区");
    }

    public void doOther(){
        System.out.println("一些其他服务");
    }
}
