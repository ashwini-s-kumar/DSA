package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class AddNodeAtPos {
    public static Node addNodeAtPos(Node head, int data, int pos)
    {
        Node newNode = new Node(data);
        if(head == null)
            return newNode;
        if(pos == 1) {
            newNode.next = head;
            return newNode;
        }
        Node cur = head;
        for(int i = 1; cur != null && i <= pos-2; i++)
        {
            cur = cur.next;
        }
        if(cur == null)
            return head;
        newNode.next = cur.next;
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
        System.out.println("The LL after adding 10  at pos= 2:");
        PrintLinkedList.print(addNodeAtPos(head, 10, 2));
    }
}
