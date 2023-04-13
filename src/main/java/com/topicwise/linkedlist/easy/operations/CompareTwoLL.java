package com.topicwise.linkedlist.easy.operations;

import com.topicwise.linkedlist.Node;

public class CompareTwoLL {
    public boolean compareTwoLL(Node head1, Node head2) {
        while(head1 != null && head2 != null && head1.data == head1.data)
        {
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 == head2)
            return true;
        else
            return false;
    }
    // TO-DO
}
