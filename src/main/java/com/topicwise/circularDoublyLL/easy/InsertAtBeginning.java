package com.topicwise.circularDoublyLL.easy;


import com.topicwise.circularDoublyLL.Traversal;
import com.topicwise.doublyLL.Node;
import com.topicwise.doublyLL.PrintDll;

public class InsertAtBeginning {
    public static Node insert(Node head, int key){
        Node newNode = new Node(key);

        if(head ==  null){
            newNode.prev = newNode;
            newNode.next = newNode;
            return newNode;
        }else{
            newNode.next = head;
            newNode.prev = head.prev;

            head.prev = newNode;
            newNode.prev.next = newNode;

            return newNode;
        }
    }

    public static void main(String [] arr){
        // 2 <-> 5 <-> 8
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.prev = head;

        head.next.next = new Node(8);
        head.next.next.prev = head.next;

        // circular
        head.next.next.next = head;
        head.prev = head.next.next;

        Traversal.print(head);

        Node head1 = insert(head, 10);

        Traversal.print(head1);
    }
}
