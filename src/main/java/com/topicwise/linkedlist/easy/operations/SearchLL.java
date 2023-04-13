package com.topicwise.linkedlist.easy.operations;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class SearchLL {
    public static int searchLL(Node head, int x)
    {
        if(head == null)
            return -1;
        Node cur = head;
        int pos = 1;
        while(cur != null)
        {
            if(cur.data == x)
                return pos;
            cur = cur.next;
            pos +=1;
        }
        return -1;
    }
    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("searchLL 40: " + searchLL(head, 40));
        System.out.println("searchLL 5: " + searchLL(head, 5));
    }
}
