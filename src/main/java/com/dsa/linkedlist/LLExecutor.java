package com.dsa.linkedlist;

import com.dsa.linkedlist.basic.*;


public class LLExecutor {
    public static void main(String [] arr)
    {
        PrintLinkedList printLinkedList = new PrintLinkedList();
        AddNodeAtTail addNodeAtTail = new AddNodeAtTail();
        AddNodeAtHead addNodeAtHead = new AddNodeAtHead();
        AddNodeAtPos addNodeAtPos = new AddNodeAtPos();
        DeleteNodeAtPosition deleteNodeAtPosition = new DeleteNodeAtPosition();
        DeleteNodeAtHead deleteNodeAtHead = new DeleteNodeAtHead();
        DeleteNodeAtTail deleteNodeAtTail = new DeleteNodeAtTail();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after adding 4  at tail:");
        printLinkedList.print(addNodeAtTail.addNodeAtTail(head, 4));

        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after adding 4  at head:");
        printLinkedList.print(addNodeAtHead.addNodeAtHead(head, 4));

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after adding 10  at pos= 2:");
        printLinkedList.print(addNodeAtPos.addNodeAtPos(head, 10, 2));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL after deleting at pos= 2:");
        printLinkedList.print(deleteNodeAtPosition.deleteNodeAtPos(head, 2));

        System.out.println("The LL in reverse order");
        printLinkedList.printReverse(head);

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("deleteNodeAtHead : ");
        printLinkedList.print(deleteNodeAtHead.deleteNodeAtHead(head));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("deleteNodeAtTail : ");
        printLinkedList.print(deleteNodeAtTail.deleteNodeAtTail(head));
    }
}
