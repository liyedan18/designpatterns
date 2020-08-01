package com.my.structure.composite;

import java.util.List;

/**
 * 抽象的地址结构类，有地址名称
 */
public abstract class Node {
    private String addr;

    public abstract List<Node> getChildNode();
    public Node(String addr){
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }
}
