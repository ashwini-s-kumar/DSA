package com.topicwise.binarytree;

public class NodeHD {
    public int data;
    public NodeHD left;
    public NodeHD right;
    public int hd;
    public  NodeHD(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.hd = Integer.MAX_VALUE;
    }
}
