package com.topicwise.linkedlist.easy;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class SegregateEvenOdd {
    public static Node segregateEvenOdd(Node head)
    {
        if(head == null)
            return head;
        Node es = null, ee = null, os = null, oe = null;
        for(Node cur = head; cur!= null; cur=cur.next)
        {
            int data = cur.data;
            if(data % 2 == 0) {
                if(es == null) {
                    es = ee = cur;
                }else {
                    ee.next = cur;
                    ee = ee.next;
                }
            }
            else{
                if(os == null) {
                    os = oe = cur;
                }else{
                    oe.next = cur;
                    oe = oe.next;
                }
            }
        }
        ee.next = os;
        return es;
    }
    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);

        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The segregateEvenOdd is :");
        PrintLinkedList.print(segregateEvenOdd(head));

    }
}
