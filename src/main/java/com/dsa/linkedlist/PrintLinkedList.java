package com.dsa.linkedlist;

public class PrintLinkedList {
    void print(Node head)
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.print(" " + cur.data);
            cur = cur.next;
        }
    }
}
