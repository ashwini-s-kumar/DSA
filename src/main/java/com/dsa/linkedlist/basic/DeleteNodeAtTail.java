package com.dsa.linkedlist.basic;

import com.dsa.linkedlist.Node;

public class DeleteNodeAtTail {
    public Node deleteNodeAtTail(Node head)
    {
       if(head == null)
           return head;
       Node cur = head;
       while(cur.next.next != null)
       {
            cur = cur.next;
       }
       cur.next = null;
       return head;
    }
}
