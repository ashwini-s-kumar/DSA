package com.dsa.linkedlist.operations;

import com.dsa.linkedlist.Node;
// 5 -> 15 -> 25 -> 35
//10 -> 20 -> 30 -> 40
public class MergeTwoSortedLL {
    public Node mergeSortedLL(Node head1, Node head2)
    {
        if(head1 == null && head2 == null)
            return head1;
        if(head1 == null )
            return head2;
        if(head2 == null)
            return head1;

        Node cur1 = head1;
        Node cur2 = head2;
        while(cur1.next != null && cur2.next != null)
        {
            if(cur1.next.data > cur2.data)
            {

            }
        }
        return head1;
    }
}
