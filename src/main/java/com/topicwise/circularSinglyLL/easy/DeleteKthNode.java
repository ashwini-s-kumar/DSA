package com.topicwise.circularSinglyLL.easy;

import com.topicwise.circularSinglyLL.Traversal;
import com.topicwise.linkedlist.Node;

// 1 -> 2 -> 3
public class DeleteKthNode {
    public static Node delete(Node head, int k) {
        if (head == null && head.next == null) {
            return null;
        }

        if (k == 1) {
            head.data = head.next.data;
            head.next = head.next.next;
        } else {
            Node cur = head;
            for(int i = 0; i < k -2; i++){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

    public static void main(String [] arr){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        Traversal.print(head);
        head = delete(head, 2);
        Traversal.print(head);
    }
}
