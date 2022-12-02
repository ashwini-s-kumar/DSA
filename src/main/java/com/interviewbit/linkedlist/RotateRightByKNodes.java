package com.interviewbit.linkedlist;

import com.topicwise.linkedlist.Node;

public class RotateRightByKNodes {

    public static Node rotate(Node head, int k)
    {
        if(head == null || head.next == null || k==0)
        {
            return head;
        }
        int count = 1;
        Node cur = head;

        while(count < k && cur != null)
        {
            count ++;
            cur = cur.next;
        }

        if(cur == null)
        {
            return head;
        }

        // find the kth node and store it
        Node kthNode = cur;

        // move cur the last node
        while(cur.next != null)
        {
            cur = cur.next;
        }
        // make the swaps
        cur.next = head;
        head = kthNode.next;
        kthNode.next = null;

        return head;
    }

    public static void main(String [] arr)
    {
        Node root1 = new Node(1);
        root1.next = new Node(2);
        root1.next.next = new Node(3);
        root1.next.next.next = new Node(4);

        PrintLinkedList.print(root1);
        System.out.println("After the pairWiseSwapNode of LL : ");
        PrintLinkedList.print(rotate(root1, 2));


    }
}
