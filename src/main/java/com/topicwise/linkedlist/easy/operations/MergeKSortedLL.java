package com.topicwise.linkedlist.easy.operations;
import com.topicwise.linkedlist.Node;
import com.topicwise.linkedlist.PrintLinkedList;

public class MergeKSortedLL {
    public static Node mergeKLists(Node arr[], int last)
    {
        MergeTwoSortedLL mergeTwoSortedLL = new MergeTwoSortedLL();
        // repeat until only one list is left
        while (last != 0) {
            int i = 0, j = last;

            // (i, j) forms a pair
            while (i < j) {
                // merge List i with List j and store
                // merged list in List i
                arr[i] = mergeTwoSortedLL.mergeTwoSortedLLRecursion(arr[i], arr[j]);

                // consider next pair
                i++;
                j--;

                // If all pairs are merged, update last
                if (i >= j)
                    last = j;
            }
        }

        return arr[0];
    }
    public static void main(String [] arr){
        int k = 3; // Number of linked lists
        int n = 4; // Number of elements in each list

        // an array of pointers storing the head nodes
        // of the linked lists
        Node array[] = new Node[k];

        array[0] = new Node(1);
        array[0].next = new Node(3);
        array[0].next.next = new Node(5);
        array[0].next.next.next = new Node(7);

        array[1] = new Node(2);
        array[1].next = new Node(4);
        array[1].next.next = new Node(6);
        array[1].next.next.next = new Node(8);

        array[2] = new Node(0);
        array[2].next = new Node(9);
        array[2].next.next = new Node(10);
        array[2].next.next.next = new Node(11);
        System.out.println("The  array of LL is :");
        PrintLinkedList.print(array[0]);
        System.out.println(" ");
        PrintLinkedList.print(array[1]);
        System.out.println(" ");
        PrintLinkedList.print(array[2]);
        // Merge all lists
        Node head4 = mergeKLists(array, k - 1);
        System.out.println(" ");
        System.out.println("The  merge of k sorted LL is :");
        PrintLinkedList.print(head4);
    }
}
