package com.dsa.linkedlist;

import com.dsa.linkedlist.basic.*;
import com.dsa.linkedlist.operations.*;
import com.dsa.linkedlist.properties.FloydCycleDetectionLL;
import com.dsa.linkedlist.properties.RemoveLoopLL;


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
        ReverseLL reverseLL = new ReverseLL();
        AddNodeSortedLL addNodeSortedLL = new AddNodeSortedLL();
        SearchLL searchLL = new SearchLL();
        SegregateEvenOdd segregateEvenOdd = new SegregateEvenOdd();
        DeleteNthNodeFromEnd deleteNthNodeFromEnd = new DeleteNthNodeFromEnd();
        MergeTwoSortedLL mergeTwoSortedLL = new MergeTwoSortedLL();
        ReverseInGroupK reverseInGroupK = new ReverseInGroupK();
        FloydCycleDetectionLL floydCycleDetectionLL = new FloydCycleDetectionLL();
        RemoveLoopLL removeLoopLL = new RemoveLoopLL();

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


        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("reverseLL : ");
        printLinkedList.print(reverseLL.reverseLL(head));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("addNodeSortedLL : ");
        printLinkedList.print(addNodeSortedLL.addNodeSortedLL(head, 35));
        System.out.println(" ");
        System.out.println("addNodeSortedLL : ");
        printLinkedList.print(addNodeSortedLL.addNodeSortedLL(head, 22));
        System.out.println(" ");
        System.out.println("addNodeSortedLL : ");
        printLinkedList.print(addNodeSortedLL.addNodeSortedLL(head, 25));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("searchLL 40: " + searchLL.searchLL(head, 40));
        System.out.println("searchLL 5: " + searchLL.searchLL(head, 5));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The segregateEvenOdd is :");
        printLinkedList.print(segregateEvenOdd.segregateEvenOdd(head));


        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The deleteNthNodeFromEnd is :");
        printLinkedList.print(deleteNthNodeFromEnd.deleteNthNodeFromEnd(head, 5));


        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node head1 = new Node(5);
        head1.next = new Node(15);
        head1.next.next = new Node(34);
        head1.next.next.next = new Node(60);
        head1.next.next.next.next = new Node(70);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head1);
        System.out.println(" ");
        System.out.println("The mergeTwoSortedLL is :");
        printLinkedList.print(mergeTwoSortedLL.mergeSortedLL(head, head1));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head1 = new Node(5);
        head1.next = new Node(15);
        head1.next.next = new Node(34);
        head1.next.next.next = new Node(60);
        head1.next.next.next.next = new Node(70);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head1);
        System.out.println(" ");
        System.out.println("The mergeTwoSortedLLRecursion is :");
        printLinkedList.print(mergeTwoSortedLL.mergeTwoSortedLLRecursion(head, head1));


        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        System.out.println(" ");
        System.out.println("The LL is :");
        printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The reverseInGroupK is :");
        printLinkedList.print(reverseInGroupK.reverseInK(head, 2));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        System.out.println(" ");
        System.out.println("The LL is :");
        //printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The floydCycleDetectionLL is :" + floydCycleDetectionLL.loopDetection(head));

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        System.out.println(" ");
        System.out.println("The LL is :");
        //printLinkedList.print(head);
        System.out.println(" ");
        System.out.println("The removeLoopLL is :" );
        printLinkedList.print(removeLoopLL.removeLoo(head));
    }
}
