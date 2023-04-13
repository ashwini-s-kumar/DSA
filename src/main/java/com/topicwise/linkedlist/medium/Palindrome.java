package com.topicwise.linkedlist.medium;

import com.topicwise.linkedlist.Node;

public class Palindrome {
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node cur = slow;
        Node prev = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        Node p1 = head;
        Node p2 = prev;

        while(p2 != null){
            if(p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String [] arr){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println(isPalindrome(head));

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        System.out.println(isPalindrome(head));
    }
}
