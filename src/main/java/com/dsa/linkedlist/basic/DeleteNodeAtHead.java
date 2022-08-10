package com.dsa.linkedlist.basic;

import com.dsa.linkedlist.Node;

public class DeleteNodeAtHead {
    public Node deleteNodeAtHead(Node head){
        if(head ==  null)
            return head;
        return head.next;
    }
}
