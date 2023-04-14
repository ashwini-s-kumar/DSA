package com.topicwise.circularSinglyLL;

import com.topicwise.linkedlist.Node;

public class Traversal {
    public static void print(Node head){
        if(head ==  null){
            return;
        }
        Node cur = head;
        do{
            System.out.print(cur.data + " ");
            cur = cur.next;
        }while (cur != head);
        System.out.println(" ");
    }
}
