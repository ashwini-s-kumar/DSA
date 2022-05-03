package com.dsa.binarytree;

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
