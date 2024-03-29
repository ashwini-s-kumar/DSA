package com.topicwise.binarytree;
/**
 *
 * @author ashwini.s
 */
public class Node {
    public int data;
    public  int height;
    public Node left;
    public Node right;
    public Node(int x)
    {
        this.data = x;
        this.height = 1;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", height=" + height +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
