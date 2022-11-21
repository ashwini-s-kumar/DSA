package com.topicwise.linkedlist.basic;

import com.topicwise.linkedlist.Node;

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
