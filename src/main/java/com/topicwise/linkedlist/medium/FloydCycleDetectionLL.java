package com.topicwise.linkedlist.medium;

import com.topicwise.linkedlist.Node;

public class FloydCycleDetectionLL {
    public static boolean loopDetection(Node head)
    {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;

        System.out.println("The floydCycleDetectionLL is :" + loopDetection(head));

    }
}
