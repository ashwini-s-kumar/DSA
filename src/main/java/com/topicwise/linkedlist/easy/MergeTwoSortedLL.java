package com.topicwise.linkedlist.easy;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

// 5 -> 15 -> 25 -> 35
//10 -> 20 -> 30 -> 40
public class MergeTwoSortedLL {
    public static Node mergeSortedLL(Node head1, Node head2)
    {
        if(head1 == null )
            return head2;
        if(head2 == null)
            return head1;

        Node head = null, tail = null;
        if(head1.data <= head2.data)
        {
            head = tail = head1;
            head1 = head1.next;
        }
        else{
            head = tail = head2;
            head2 = head2.next;
        }
        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }
        if(head1 == null)
            tail.next = head2;
        else if(head2 == null)
            tail.next = head1;
        return head;
    }
    public Node mergeTwoSortedLLRecursion(Node a , Node b)
    {
        Node result = null;
        /* Base cases */
        if (a == null)
            return b;
        else if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = mergeTwoSortedLLRecursion(a.next, b);
        }
        else {
            result = b;
            result.next = mergeTwoSortedLLRecursion(a, b.next);
        }

        return result;
    }

    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node head1 = new Node(5);
        head1.next = new Node(15);
        head1.next.next = new Node(34);
        head1.next.next.next = new Node(60);
        head1.next.next.next.next = new Node(70);

        System.out.println(" ");
        System.out.println("The LL is :");
        PrintLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL is :");
        PrintLinkedList.print(head1);
        System.out.println(" ");
        System.out.println("The mergeTwoSortedLL is :");
        PrintLinkedList.print(mergeSortedLL(head, head1));

    }

}
