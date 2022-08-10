package com.dsa.linkedlist.basic;

import com.dsa.linkedlist.Node;

public class AddNodeAtTail {
    public Node addNodeAtTail(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        Node cur = head;
        while(cur.next != null)
        {
            cur = cur.next;
        }
        cur.next = newNode;
        return head;
    }
}
