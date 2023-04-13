package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class AddNodeAtHead {
    public static Node addNodeAtHead(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        newNode.next = head;
        return newNode;
    }

    public static void main(String [] arr){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("The LL is :");
        
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after adding 4  at head:");
        PrintLinkedList.print(addNodeAtHead(head, 4));
    }
}
