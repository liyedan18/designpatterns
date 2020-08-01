package com.my.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class AddrNode extends Node {
    private List<Node> childNode = new ArrayList<>();

    public AddrNode(String addr) {
        super(addr);
    }

    @Override
    public List<Node> getChildNode() {
        return this.childNode;
    }

    public void addChildNode(AddrNode childNode) {
        childNode.addChildNode(childNode);
    }
}
