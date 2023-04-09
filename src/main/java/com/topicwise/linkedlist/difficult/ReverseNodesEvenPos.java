package com.topicwise.linkedlist.difficult;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

import java.util.Stack;

public class ReverseNodesEvenPos {
    public static Node reverseEvenPos(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node temp = head;
        Stack<Integer> s = new Stack<>();
        while(temp != null)
        {
            s.push(temp.data);
            temp = temp.next;
        }
        int size = s.size();
        if(size % 2 != 0)
        {
            s.pop();
        }
        temp = head;
        while(temp != null && !s.isEmpty())
        {
            int val = s.pop();
            temp = temp.next;
            temp.data = val;
            temp = temp.next;
            s.pop();
        }

        return head;
    }

    public static void main(String [] arr)
    {
        Node root1 = new Node(1);
        root1.next = new Node(4);
        root1.next.next = new Node(3);
        root1.next.next.next = new Node(2);
        root1.next.next.next.next = new Node(5);
        root1.next.next.next.next.next = new Node(8);

        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(root1);
        System.out.println("  ");
        System.out.println("After the partitionList of LL : ");
        printLinkedList.print(reverseEvenPos(root1));

    }
}
