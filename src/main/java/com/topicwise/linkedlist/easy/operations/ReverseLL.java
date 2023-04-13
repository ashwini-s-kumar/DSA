package com.topicwise.linkedlist.easy.operations;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

// 10 -> 20 -> 30 -> 40
// 1  -> 2  -> 3   -> 4
// 40 -> 30 -> 20  -> 10
public class ReverseLL {
    public static Node reverseLL(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("reverseLL : ");
        PrintLinkedList.print(reverseLL(head));
    }
}
