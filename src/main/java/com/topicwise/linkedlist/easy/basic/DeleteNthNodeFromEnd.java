package com.topicwise.linkedlist.easy.basic;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class DeleteNthNodeFromEnd {
    /*m = 3,
n = 5; find len
delete = (5-3) = 2.next = 2.next.next
1 -- > 2 --> 3 --> 4 --> 5
Traverse the list and find the length M. Again traverse the linked list from the start till we reach the (M − N)th node. Now we delete the (M - N + 1)th node and return the head pointer. Before deleting the node, we need to relink the next pointer of the (M - N)th node to the (M − N + 2)th node.*/
    public static Node deleteNthNodeFromEnd(Node head , int m)
    {
        int len = 0;
        Node cur = head;
        while(cur != null)
        {
            len += 1;
            cur = cur.next;
        }
        if(len < m)
            return null;
        if(len - m == 0)
            return head.next;
        int count = 1;
        cur = head;
        while(count != len - m  && cur != null)
        {
            cur = cur.next;
            count ++;
        }
        cur.next = cur.next.next;
        return head;
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
        System.out.println("The deleteNthNodeFromEnd is :");
        PrintLinkedList.print(deleteNthNodeFromEnd(head, 5));

    }
}
