package com.topicwise.hashing.medium.collision.openAddressing;

public class LinearProbing {
    int size,capacity;
    int [] table;

    public LinearProbing(int capacity){
        this.size = 0;
        this.capacity = capacity;
        this.table = new int[capacity];
        for(int i = 0; i < capacity; i++){
            table[i] = -1;
        }
    }

    private int hash(int key){
        return key % capacity;
    }

    public void insert(int key){
        int hash = hash(key);
        while(table[hash] != -1 && table[hash] != -1 && table[hash] != key){
            hash = (hash +1) % capacity;
        }
        if(table[hash] == key){
           System.out.println("The key already exist !");
           return;
        }
        table[hash] = key;
        size ++;
        System.out.println("The key is successfully added !");
    }

    public void remove(int key){
        int hash1 = hash(key);
        while(table[hash1] != -1){
            if(table[hash1] == key){
                table[hash1] = -2;
                System.out.println("Successfully removed key : "+ key);
                size --;
            }
            int hash2 = (hash1  + 1) % capacity;
            if(hash2 == hash1){
                System.out.println("Failed to remove Key : "+ key);
                return;
            }
        }
    }

    public boolean search(int key){
        int hash1 = hash(key);
        int hash2 = hash1;
        while(table[hash1] != -1){
            if(table[hash1] == key){
                return true;
            }
            hash2 = (hash2  + 1) % capacity;
            if(hash2 == hash1){
                return false;
            }
        }
        return false;
    }

    public void print(){
        for(int i = 0 ; i < size; i++){
            System.out.print(" " + table[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String [] arr)
    {
        LinearProbing linearProbing = new LinearProbing(7);
        linearProbing.insert(30);
        linearProbing.insert(80);
        linearProbing.print();

        linearProbing.insert(31);
        linearProbing.print();

        linearProbing.insert(15);
        linearProbing.print();

        linearProbing.insert(14);
        linearProbing.insert(21);
        linearProbing.print();

        System.out.println(linearProbing.search(14));
        System.out.println(linearProbing.search(80));
        System.out.println(linearProbing.search(67));

        linearProbing.remove(15);
        linearProbing.print();

        linearProbing.remove(31);
        linearProbing.print();

    }
}
