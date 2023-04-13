package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class AddNodeAtTail {
    public static Node addNodeAtTail(Node head, int data)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        Node cur = head;
        while(cur.next != null)
        {
            cur = cur.next;
        }
        cur.next = newNode;
        return head;
    }
    public static void main(String [] arr){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after adding 4  at tail:");
        PrintLinkedList.print(addNodeAtTail(head, 4));
    }
}
