package com.dsa.linkedlist.operations;

import com.dsa.linkedlist.Node;

public class SearchLL {
    public int searchLL(Node head, int x)
    {
        if(head == null)
            return -1;
        Node cur = head;
        int pos = 1;
        while(cur != null)
        {
            if(cur.data == x)
                return pos;
            cur = cur.next;
            pos +=1;
        }
        return -1;
    }
}
