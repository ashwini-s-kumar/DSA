package com.topicwise.linkedlist.easy.operations;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class AddNodeSortedLL {
    public static Node addNodeSortedLL(Node head, int x)
    {
        Node newNode = new Node(x);
        Node cur = head;
        if(cur != null && cur.data >= x)
        {
            newNode.next = cur;
            return newNode;
        }
        while(cur != null)
        {
            if (cur.next != null && cur.next.data <= x)
            {
                cur = cur.next;
            }
            else{
                newNode.next = cur.next;
                cur.next = newNode;
                break;
            }
        }
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
        System.out.println("addNodeSortedLL : " + 35);
        PrintLinkedList.print(addNodeSortedLL(head, 35));
        System.out.println(" ");
        System.out.println("addNodeSortedLL : " + 22);
        PrintLinkedList.print(addNodeSortedLL(head, 22));
        System.out.println(" ");
        System.out.println("addNodeSortedLL : " + 25);
        PrintLinkedList.print(addNodeSortedLL(head, 25));

    }
}
