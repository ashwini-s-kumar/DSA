package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class DeleteNodeAtPosition {
    // ll = 10 -> 20 -> 30 -> 40
    //pos = 1  -> 2  -> 3  -> 4
    public static Node deleteNodeAtPos(Node head, int pos)
    {
        if(head == null)
            return head;
        if(pos == 1)
            return head.next;
        Node cur = head;
        for(int i = 1 ; cur != null && i <= pos-2 ; i++)
        {
            cur = cur.next;
        }
        if(cur == null)
            return head;
        cur.next = cur.next.next;
        return head;
    }

    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(" ");
        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after deleting at pos= 2:");
        PrintLinkedList.print(deleteNodeAtPos(head, 2));

    }
}
