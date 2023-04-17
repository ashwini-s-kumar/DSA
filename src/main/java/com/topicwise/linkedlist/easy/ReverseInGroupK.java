package com.topicwise.linkedlist.easy;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class ReverseInGroupK {
    public static Node  reverseInK(Node head, int k)
    {
        if(head == null)
            return head;
        Node prev = null, next = null , cur = head;
        int count = 1;
        while(cur != null && count <= k)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;
        }
        if(next != null)
        {
            Node head_res = reverseInK(next, k);
            head.next = head_res;
        }
        return prev;
    }
    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);

        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The reverseInGroupK is :");
        PrintLinkedList.print(reverseInK(head, 2));
    }
}
