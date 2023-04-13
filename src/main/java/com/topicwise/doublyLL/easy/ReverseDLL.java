package com.topicwise.doublyLL.easy;

import com.topicwise.doublyLL.Node;
import com.topicwise.doublyLL.PrintDll;

public class ReverseDLL {
    public static Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node cur = head;
        Node temp = null;

        while(cur != null){
            temp = cur.prev;
            cur.prev = cur.next;
            cur.next = temp;

            cur = cur.prev;
        }
        return temp.prev;
    }

    public static void main(String [] ar){
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.prev = head;

        head.next.next = new Node(8);
        head.next.next.prev = head.next;

        PrintDll.print(head);

        Node head1 = reverse(head);

        PrintDll.print(head1);
    }
}
