package com.dsa.linkedlist.operations;

import com.dsa.linkedlist.Node;

public class SegregateEvenOdd {
    public Node segregateEvenOdd(Node head)
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
}
