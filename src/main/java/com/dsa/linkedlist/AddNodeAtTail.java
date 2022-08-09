package com.dsa.linkedlist;

public class AddNodeAtTail {
    Node addNodeAtTail(Node head, int data)
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
