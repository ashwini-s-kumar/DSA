package com.dsa.linkedlist.properties;

import com.dsa.linkedlist.Node;

public class FloydCycleDetectionLL {
    public boolean loopDetection(Node head)
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
}
