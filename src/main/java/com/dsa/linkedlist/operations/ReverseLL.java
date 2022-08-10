package com.dsa.linkedlist.operations;

import com.dsa.linkedlist.Node;

import java.util.ArrayDeque;
import java.util.Deque;

// 10 -> 20 -> 30 -> 40
// 1  -> 2  -> 3   -> 4
// 40 -> 30 -> 20  -> 10
public class ReverseLL {
    public Node reverseLL(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
