package com.interviewbit.linkedlist;

import com.topicwise.linkedlist.Node;

import java.util.Stack;

public class PrintLinkedList {
    static void print(Node head)
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.print(" " + cur.data);
            cur = cur.next;
        }
    }

    static void printReverse(Node head)
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
