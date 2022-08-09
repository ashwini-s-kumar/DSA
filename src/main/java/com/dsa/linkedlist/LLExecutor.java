package com.dsa.linkedlist;

import javax.swing.*;

public class LLExecutor {
    public static void main(String [] arr)
    {
        PrintLinkedList printLinkedList = new PrintLinkedList();
        AddNodeAtTail addNodeAtTail = new AddNodeAtTail();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after adding 4 :");
        printLinkedList.print(addNodeAtTail.addNodeAtTail(head, 4));

    }
}
