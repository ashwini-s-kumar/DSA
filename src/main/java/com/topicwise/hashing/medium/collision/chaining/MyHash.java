package com.topicwise.hashing.medium.collision.chaining;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHash {
    private int capacity;
    private List<LinkedList<Integer>> table;

    public MyHash(int capacity){
        this.capacity = capacity;
        table = new ArrayList<>();
        for(int i = 0; i < capacity; i++){
            table.add(new LinkedList<>());
        }
    }

    private int hash(int key){
        return key % capacity;
    }

    public void insert(int key){
        int hash = hash(key);
        table.get(hash).add(key);
    }
    public void remove(int key){
        int hash = hash(key);
        if(table.get(hash).contains(key)) {
            table.get(hash).remove((Integer)key);
        }
    }
    public boolean search(int key){
        int hash = hash(key);
        return table.get(hash).contains(key);
    }

    public void print(){
        System.out.println(table);
    }
    public static void main(String [] arr)
    {
        MyHash myHash = new MyHash(7);
        myHash.insert(30);
        myHash.insert(80);
        myHash.print();

        myHash.insert(31);
        myHash.print();

        myHash.insert(15);
        myHash.print();

        myHash.insert(14);
        myHash.insert(21);
        myHash.print();

        System.out.println(myHash.search(14));
        System.out.println(myHash.search(80));
        System.out.println(myHash.search(67));

        myHash.remove(15);
        myHash.print();

        myHash.remove(31);
        myHash.print();

    }
}
