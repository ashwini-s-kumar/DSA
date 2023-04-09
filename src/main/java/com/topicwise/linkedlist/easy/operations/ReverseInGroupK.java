package com.topicwise.linkedlist.easy.operations;

import com.topicwise.linkedlist.Node;

public class ReverseInGroupK {
    public Node  reverseInK(Node head, int k)
    {
        if(head == null)
            return head;
        Node prev = null, next = null , cur = head;
        int count = 1;
        while(cur != null && count <= k)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        if(next != null)
        {
            Node head_res = reverseInK(next, k);
            head.next = head_res;
        }
        return prev;
    }
}
