package com.topicwise.doublyLL.easy;

import com.topicwise.doublyLL.Node;
import com.topicwise.doublyLL.PrintDll;

public class InsertAtBeginning {
    public static Node insert(Node head, int data){
        Node newN = new Node(data);

        if(head == null){
            return newN;
        }

        newN.next = head;
        head.prev = newN;
        return newN;
    }
    public static void main(String [] ar){
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.prev = head;

        head.next.next = new Node(8);
        head.next.next.prev = head.next;

        PrintDll.print(head);

        Node head1 = insert(head, 10);

        PrintDll.print(head1);
    }
}
