package com.dsa.linkedlist.operations;

import com.dsa.linkedlist.Node;
// 5 -> 15 -> 25 -> 35
//10 -> 20 -> 30 -> 40
public class MergeTwoSortedLL {
    public Node mergeSortedLL(Node head1, Node head2)
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
}
