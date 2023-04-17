package com.topicwise.linkedlist.easy;

import com.topicwise.linkedlist.Node;

public class MiddleOfLL {
    public static void middle(Node head){
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
    public static void main(String [] ar){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);

        middle(head);
    }
}
