package com.dsa.linkedlist.basic;

import com.dsa.linkedlist.Node;

public class AddNodeAtHead {
    public Node addNodeAtHead(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        newNode.next = head;
        return newNode;
    }
}
