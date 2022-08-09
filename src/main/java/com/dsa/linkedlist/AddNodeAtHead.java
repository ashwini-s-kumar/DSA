package com.dsa.linkedlist;

public class AddNodeAtHead {
    Node addNodeAtHead(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        newNode.next = head;
        return newNode;
    }
}
