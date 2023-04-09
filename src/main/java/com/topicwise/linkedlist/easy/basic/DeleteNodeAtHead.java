package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;

public class DeleteNodeAtHead {
    public Node deleteNodeAtHead(Node head){
        if(head ==  null)
            return head;
        return head.next;
    }
}
