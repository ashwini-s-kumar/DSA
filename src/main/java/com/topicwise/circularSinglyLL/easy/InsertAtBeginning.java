package com.topicwise.circularSinglyLL.easy;

import com.topicwise.circularSinglyLL.Traversal;
import com.topicwise.linkedlist.Node;

public class InsertAtBeginning {

    public static Node insert(Node head, int key){
        Node newNode = new Node(key);

        if(head == null){
            newNode.next = newNode;
            return  newNode;
        }

        newNode.next = head.next;
        head.next = newNode;

        int temp = head.data;
        head.data = newNode.data;
        newNode.data = temp;

        return head;
    }

    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        Traversal.print(head);
        head = insert(head, 40);
        Traversal.print(head);
    }
}
