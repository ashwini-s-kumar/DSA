package com.topicwise.linkedlist.medium.properties;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class RemoveLoopLL {
    public static Node removeLoop(Node head)
    {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(slow != fast)
            return head;
        slow = head;
        while(slow.next != fast.next)
        {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }
    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;

        System.out.println("The removeLoopLL is :" );
        PrintLinkedList.print(removeLoop(head));
    }
}
