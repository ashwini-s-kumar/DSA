package com.dsa.linkedlist;

public class AddNodeAtPos {
    Node addNodeAtPos(Node head, int data, int pos)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        if(pos == 1) {
            newNode.next = head;
            return newNode;
        }
        Node cur = head;
        for(int i = 1; cur != null && i <= pos-2; i++)
        {
            cur = cur.next;
        }
        if(cur == null)
            return head;
        newNode.next = cur.next;
        cur.next = newNode;
        return head;
    }
}
