package com.topicwise.linkedlist.medium;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class IntersectionOfLL {

    public static Node intersection(Node a , Node b)
    {
        if(a == null || b == null)
        {
            return null;
        }

        Node curA = a, curB = b;
        int countA = 1, countB = 1;

        while(curA.next != null)
        {
            curA = curA.next;
            countA++;
        }

        while(curB.next != null)
        {
            curB = curB.next;
            countB++;
        }

        if(!curA.equals(curB))
        {
            return null;
        }

        curA = a;
        curB = b;

        int diff = Math.abs(countA - countB);
        if(countA > countB)
        {
            while(diff-- > 0)
            {
                curA = curA.next;
            }
        }else{
            while(diff-- > 0)
            {
                curB = curB.next;
            }
        }

        while (!curA.equals(curB) )
        {
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }

    public static void main(String [] arr)
    {
        Node root1 = new Node(1);
        root1.next = new Node(2);
        root1.next.next = new Node(3);
        root1.next.next.next = new Node(4);

        Node root2 = new Node(1);
        root2.next = new Node(2);
        root2.next.next = new Node(3);

        Node root3 = new Node(50);
        root3.next = new Node(60);

        root1.next.next.next.next = root3;
        root2.next.next.next = root3;

        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(root1);
        System.out.println(" ");
        printLinkedList.print(root2);
        System.out.println(" ");
        System.out.println("After the intersection of LL : ");
        System.out.println(" ");
        printLinkedList.print(intersection(root1, root2));

    }
}
