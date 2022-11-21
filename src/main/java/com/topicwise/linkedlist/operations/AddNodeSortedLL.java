package com.topicwise.linkedlist.operations;

import com.topicwise.linkedlist.Node;

public class AddNodeSortedLL {
    public Node addNodeSortedLL(Node head, int x)
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
                continue;
            }
            else{
                newNode.next = cur.next;
                cur.next = newNode;
                break;
            }
        }
        return head;
    }
}
