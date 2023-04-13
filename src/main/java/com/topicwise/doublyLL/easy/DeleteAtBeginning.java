package com.topicwise.doublyLL.easy;

import com.topicwise.doublyLL.Node;
import com.topicwise.doublyLL.PrintDll;

public class DeleteAtBeginning {
    public static Node delete(Node head){
        if(head == null || head.next == null){
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    public static void main(String [] ar){
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.prev = head;

        head.next.next = new Node(8);
        head.next.next.prev = head.next;

        PrintDll.print(head);

        Node head1 = delete(head);

        PrintDll.print(head1);
    }
}
