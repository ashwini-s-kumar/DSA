package com.dsa.linkedlist.basic;

import com.dsa.linkedlist.Node;

public class DeleteNodeAtPosition {
    // ll = 10 -> 20 -> 30 -> 40
    //pos = 1  -> 2  -> 3  -> 4
    public Node deleteNodeAtPos(Node head, int pos)
    {
        if(head == null)
            return head;
        if(pos == 1)
            return head.next;
        Node cur = head;
        for(int i = 1 ; cur != null && i <= pos-2 ; i++)
        {
            cur = cur.next;
        }
        if(cur == null)
            return head;
        cur.next = cur.next.next;
        return head;
    }
}
