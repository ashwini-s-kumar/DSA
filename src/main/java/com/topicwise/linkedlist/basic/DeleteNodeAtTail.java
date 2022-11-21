package com.topicwise.linkedlist.basic;

import com.topicwise.linkedlist.Node;

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
