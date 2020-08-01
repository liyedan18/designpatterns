package com.my.structure.composite;


import com.alibaba.fastjson.JSON;

/**
 * 保存全国地区的地址列表
 */
public class Client {
    public static void main(String[] args) {
        //不是用Node
//        Node rootNode = new AddrNode("根");
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

        System.out.println(JSON.toJSON(rootNode));
    }
}
