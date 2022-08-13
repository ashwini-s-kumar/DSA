package com.dsa.linkedlist.properties;

import com.dsa.linkedlist.Node;

public class RemoveLoopLL {
    public Node removeLoo(Node head)
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
}
