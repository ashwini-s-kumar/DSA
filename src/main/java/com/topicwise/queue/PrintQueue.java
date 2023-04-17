package com.topicwise.queue;

import java.util.Queue;

public class PrintQueue {
    public static void print(Queue<?> queue){
        for(Object ele : queue){
            System.out.print(ele + " ");
        }
        System.out.println(" ");
    }
}
