package com.topicwise.linkedlist.medium;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class SortBinaryLL {

    public static Node simpleSort(Node head){
        Node zs = null, ze= null , os = null, oe = null;
        for (Node cur = head;cur != null; cur = cur.next){
            if(cur.data == 0){
                if(zs == null){
                    zs = ze = cur;
                }else{
                    ze.next = cur;
                    ze = ze.next;
                }
            }else{
                if(os == null){
                    os = oe = cur;
                }else{
                    oe.next = cur;
                    oe = oe.next;
                }
            }
        }
        if (ze != null) {
            ze.next = os;
        }
        if (oe != null) {
            oe.next = null;
        }

        return zs != null ? zs : os;
    }

    public static Node sortBinaryLL(Node head)
    {
        Node start = new Node(0);
        start.next = head;
        Node prev = start;

        Node cur = head;
        while(cur != null)
        {
            if(cur.next != null && cur.next.data < cur.data)
            {
                while(prev.next != null && prev.next.data < cur.next.data)
                {
                    prev = prev.next;
                }

                Node temp = prev.next;
                prev.next = cur.next;
                cur.next = cur.next.next;

                prev.next.next = temp;
                prev = start;
            }
            else{
                cur = cur.next;
            }
        }
        return start.next;
    }

    public static void main(String [] arr)
    {
        Node root1 = new Node(1);
        root1.next = new Node(0);
        root1.next.next = new Node(1);
        root1.next.next.next = new Node(0);

        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(root1);
        System.out.println("After the pairWiseSwapNode of LL : ");
        printLinkedList.print(sortBinaryLL(root1));

        Node root2 = new Node(1);
        root2.next = new Node(0);
        root2.next.next = new Node(1);
        root2.next.next.next = new Node(0);
        printLinkedList.print(root2);
        System.out.println("After the simpleSort of LL : ");
        printLinkedList.print(simpleSort(root2));
    }
}
