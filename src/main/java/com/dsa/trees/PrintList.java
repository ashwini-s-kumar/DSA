package com.dsa.trees;

public class PrintList {
    public static void printList(Node root)
    {
        Node cur = root;
        while( cur != null)
        {
            System.out.print(cur.data +" ");
            cur = cur.right;
        }
    }
}
