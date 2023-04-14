package com.topicwise.circularSinglyLL.easy;

import com.topicwise.circularSinglyLL.Traversal;
import com.topicwise.linkedlist.Node;

public class DeleteAtBeginning {
    public static Node delete(Node head){
        if(head == null && head.next==null){
            return null;
        }

        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }

    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        Traversal.print(head);
        head = delete(head);
        Traversal.print(head);
    }
}
