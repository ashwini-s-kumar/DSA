package com.topicwise.linkedlist.medium;

import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class AddTwoNumbersLL {
    public static Node addTwoNumbers(Node A, Node B) {
        Node res = new Node(0);
        Node resCur = res;
        Node node ;
        if(A == null)
        {
            return B;
        }
        if(B == null)
        {
            return A;
        }
        Node curA = A;
        Node curB = B;
        int rem = 0;
        while(curA != null || curB != null)
        {
            node = new Node(0);
            int sum = 0;
            if(curA != null)
            {
                sum += curA.data;
                curA = curA.next;
            }
            if(curB != null)
            {
                sum += curB.data;
                curB = curB.next;
            }
            if(rem > 0)
            {
                sum += rem;
            }
            if(sum >= 10)
            {
                rem = sum % 10;
                node.data =rem;
                System.out.println("rem : " + rem);
                System.out.println("node : " + node.data);
                rem = sum / 10;
            }
            else
            {
                node.data = sum;
                System.out.println("sum : " + sum);
                System.out.println("node : " + node.data);
            }
            resCur.next = node;
            resCur = resCur.next;
        }
        return res.next;
    }

    public static void main(String [] arr)
    {
        Node root1 = new Node(2);
        root1.next = new Node(4);
        root1.next.next = new Node(3);

        Node root2 = new Node(5);
        root2.next = new Node(6);
        //root2.next.next = new Node(4);

        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(root1);
        System.out.println("  ");
        printLinkedList.print(root2);
        System.out.println("  ");
        System.out.println("After the addTwoNumbers of LL : ");
        printLinkedList.print(addTwoNumbers(root1, root2));

    }

}
