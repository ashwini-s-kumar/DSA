package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class DeleteNodeAtTail {
    public static Node deleteNodeAtTail(Node head)
    {
       if(head == null)
           return head;
       Node cur = head;
       while(cur.next.next != null)
       {
            cur = cur.next;
       }
       cur.next = null;
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
        System.out.println("deleteNodeAtTail : ");
        PrintLinkedList.print(deleteNodeAtTail(head));

    }
}
