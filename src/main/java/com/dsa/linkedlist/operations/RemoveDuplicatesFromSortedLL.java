package com.dsa.linkedlist.operations;

import com.dsa.linkedlist.Node;

public class RemoveDuplicatesFromSortedLL {
    public Node removeDuplicates(Node head)
    {
        if(head == null || head.next == null)
            return head;
        Node cur = head;
        while(cur != null && cur.next != null)
        {
            if(cur.data == cur.next.data)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}
