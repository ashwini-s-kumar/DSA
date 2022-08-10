package com.dsa.linkedlist;

import java.util.Stack;

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

    void printReverse(Node head)
    {
        if(head == null)
            return;
        Stack<Integer> s = new Stack<>();
        Node cur = head;
        s.add(cur.data);
        while(cur.next != null)
        {
            cur = cur.next;
            s.add(cur.data);
        }
        while(!s.isEmpty())
        {
            System.out.print(" "+s.pop());
        }
    }
}
