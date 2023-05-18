package com.topicwise.linkedlist.medium;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class PairWiseSwap {

    public static void main(String [] arr)
    {
        Node root1 = new Node(1);
        root1.next = new Node(2);
        root1.next.next = new Node(3);
        root1.next.next.next = new Node(4);

        Node root2 = new Node(1);
        root2.next = new Node(2);
        root2.next.next = new Node(3);

        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(root1);
        System.out.println("After the pairWiseSwapNode of LL : ");
        printLinkedList.print(pairWiseSwapNode(root1));

        System.out.println("  ");

        printLinkedList.print(root2);
        System.out.println("After the pairWiseSwapData of LL : ");
        printLinkedList.print(pairWiseSwapData(root2));

    }
    public static Node pairWiseSwapNode(Node head)
    {
        if(head == null | head.next == null) {
            return head;
        }
        Node cur = head.next.next;
        Node prev = head;
        head = head.next;
        head.next = prev;

        while(cur != null && cur.next != null)
        {
            prev.next = cur.next;
            prev = cur;

            Node next = cur.next.next;
            cur.next.next = cur;

            cur = next;
        }
        prev.next = cur;

        return head;
    }
    public static Node pairWiseSwapData(Node head)
    {
        if(head == null | head.next == null) {
            return head;
        }
        Node cur = head;
        while(cur != null  && cur.next != null)
        {
            int temp = cur.data;
            cur.data = cur.next.data;
            cur.next.data = temp;
            cur = cur.next.next;
        }
        return head;
    }
}
