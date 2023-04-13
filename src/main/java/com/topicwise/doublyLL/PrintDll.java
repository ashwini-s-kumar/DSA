package com.topicwise.doublyLL;

public class PrintDll {
    public static void print(Node head)
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.print(" " + cur.data);
            cur = cur.next;
        }
        System.out.println(" ");
    }
}
