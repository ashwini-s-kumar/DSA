package com.topicwise.linkedlist.difficult;

import com.topicwise.linkedlist.LruNode;
import com.topicwise.linkedlist.PrintLinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRU {

    static Map<Integer, LruNode> map = new HashMap<>();
    static int capacity;
    static LruNode head;
    static LruNode tail;

    public LRU(int capacity){
        this.capacity = capacity;
        head = new LruNode(-1, -1);
        tail = new LruNode(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public static int get(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        LruNode node = map.get(key);
        remove(node);
        addFirst(node);

        return node.val;
    }

    public static void put(int key, int val) {
        LruNode node = map.get(key);
        if (node != null) {
            // If the key already exists, update the value and move the node to the front of the list
            node.val = val;
            remove(node);
            addFirst(node);
        } else {
            // If the key doesn't exist, create a new node and add it to the front of the list
            node = new LruNode(key, val);
            map.put(key, node);
            addFirst(node);
            // If the cache is full, remove the least recently used node from the tail of the list and the map
            if (map.size() > capacity) {
                LruNode last = tail.prev;
                remove(last);
                map.remove(last.key);
            }
        }
    }

    public static void addFirst(LruNode node){
        LruNode next = head.next;
        LruNode prev = head;

        node.prev = prev;
        node.next = next;

        prev.next = node;
        next.prev = node;
    }
    public static void remove(LruNode node){
        LruNode next = node.next;
        LruNode prev = node.prev;

        prev.next = next;
        next.prev = prev;
    }

    public static void main(String [] arr){
        LRU lru = new LRU(3);
        put(1, 10);
        put(2, 20);

        System.out.println(map);
        PrintLinkedList.print(head);

        System.out.println(get(1));
        System.out.println(map);
        PrintLinkedList.print(head);
        System.out.println(get(2));
        System.out.println(map);
        PrintLinkedList.print(head);
        System.out.println(get(3));

        PrintLinkedList.print(head);
        System.out.println(map);

        put(3, 30);
        PrintLinkedList.print(head);
        System.out.println(map);
        put(4, 40);
        PrintLinkedList.print(head);
        System.out.println(map);
    }
}
