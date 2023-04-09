package com.topicwise.hashing.medium.collision.openAddressing;

public class DoubleHasing {
    private int [] table;
    private int capacity;

    public DoubleHasing(int capacity){
        this.capacity = capacity;
        table = new int[capacity];
        for(int i = 0; i < capacity; i++){
            table[i] = -1;
        }
    }
    private int hash(int key, int i){
        int h1 = key % capacity;
        int h2 = (key % (capacity -1 )) + 1;

        return  (h1 + ( i * h2)) % capacity;
    }

    public void insert(int key){
        int i = 0;
        int hash = hash(key, i);
        while(table[hash] != -1 && table[hash] != -2 && table[hash] != key){
            i++;
            hash = hash(key, i);
        }
        table[hash] = key;
        System.out.println("Successfully added key : "+ key);
    }

    public void remove(int key){
        int i = 0;
        int hash = hash(key, i);
        while(table[hash] != -1){
            if(table[hash] == key){
                table[hash] = -2;
                System.out.println("Successfully removed the key : " + key);
                return;
            }
            i++;
            hash = hash(key, i);
        }
    }
    public boolean search(int key){
        int i = 0;
        int hash = hash(key, i);
        while(table[hash] != -1){
            if(table[hash] == key){
                return true;
            }
            i++;
            hash = hash(key, i);
        }
        return false;
    }
    public void print(){
        for(int i = 0 ; i < table.length; i++){
            System.out.print(" " + table[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String [] arr)
    {
        DoubleHasing doubleHasing = new DoubleHasing(7);
        doubleHasing.print();
        doubleHasing.insert(30);
        doubleHasing.insert(80);
        doubleHasing.print();

        doubleHasing.insert(31);
        doubleHasing.print();

        doubleHasing.insert(15);
        doubleHasing.print();

        doubleHasing.insert(14);
        doubleHasing.insert(21);
        doubleHasing.print();

        System.out.println(doubleHasing.search(14));
        System.out.println(doubleHasing.search(31));
        System.out.println(doubleHasing.search(67));

        doubleHasing.remove(15);
        doubleHasing.print();

        doubleHasing.remove(31);
        doubleHasing.print();

    }
}
