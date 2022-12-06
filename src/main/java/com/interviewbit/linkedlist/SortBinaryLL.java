package com.interviewbit.linkedlist;

import com.topicwise.linkedlist.Node;

public class SortBinaryLL {

    public static Node sortBinaryLL(Node head)
    {
        Node start = new Node(0);
        start.next = head;
        Node prev = start;

        Node cur = head;
        while(cur != null)
        {
            if(cur.next != null && cur.next.data < cur.data)
            {
                while(prev.next != null && prev.next.data < cur.next.data)
                {
                    prev = prev.next;
                }

                Node temp = prev.next;
                prev.next = cur.next;
                cur.next = cur.next.next;

                prev.next.next = temp;
                prev = start;
            }
            else{
                cur = cur.next;
            }
        }
        return start.next;
    }

    public static void main(String [] arr)
    {
        Node root1 = new Node(1);
        root1.next = new Node(0);
        root1.next.next = new Node(1);
        root1.next.next.next = new Node(0);

        PrintLinkedList.print(root1);
        System.out.println("After the pairWiseSwapNode of LL : ");
        PrintLinkedList.print(sortBinaryLL(root1));


    }
}
