package com.interviewbit.linkedlist;

import com.topicwise.linkedlist.Node;

public class PartitionList {
    /*
    Given a linked list and a value x, partition it such that
    all nodes less than x come before nodes greater than or equal to x.
    Given 1->4->3->2->5->2 and x = 3,
    return 1->2->2->4->3->5.
     */
    public static Node partitionList(Node A, int B)
    {
        Node lessPrev = null;
        Node greaterPrev = null;
        Node head = A;
        Node greaterHead = null;

        while (A != null) {
            if (A.data < B) {
                if (lessPrev != null) {
                    lessPrev.next = A;
                    lessPrev = A;
                } else {
                    lessPrev = A;
                    head = A;
                }
            } else {

                if (greaterPrev != null) {
                    greaterPrev.next = A;
                    greaterPrev = A;
                } else {
                    greaterPrev = A;
                    greaterHead = A;
                }

            }

            A = A.next;
        }

        if (greaterPrev != null)
            greaterPrev.next = null;

        if (lessPrev != null) {
            lessPrev.next = greaterHead;
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
        root1.next.next.next.next.next = new Node(2);


        PrintLinkedList.print(root1);
        System.out.println("  ");
        System.out.println("After the partitionList of LL : ");
        PrintLinkedList.print(partitionList(root1, 3));

    }
}
