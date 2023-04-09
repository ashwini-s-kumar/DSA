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
        while(table[hash] != -1 && table[hash] != -2 && table[hash] != key){
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
        int hash = hash(key);
        while(table[hash] != -1){
            if(table[hash] == key){
                table[hash] = -2;
                System.out.println("Successfully removed key : "+ key);
                size --;
                return;
            }
            hash = (hash + 1) % capacity;
        }
    }

    public boolean search(int key){
        int hash = hash(key);
        while(table[hash] != -1){
            if(table[hash] == key){
                return true;
            }
            hash = (hash + 1) % capacity;
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
        LinearProbing linearProbing = new LinearProbing(7);
        linearProbing.print();
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
        System.out.println(linearProbing.search(31));
        System.out.println(linearProbing.search(67));

        linearProbing.remove(15);
        linearProbing.print();

        linearProbing.remove(31);
        linearProbing.print();

    }
}
