package com.topicwise.hashing.medium.collision.openAddressing;

public class QuadraticHashing {
    private int [] table;
    private int capacity;
    public QuadraticHashing(int capacity){
        this.capacity = capacity;
        table = new int[capacity];
        for(int i = 0; i < capacity; i++){
            table[i] = -1;
        }
    }
    private int hash(int key, int i){

        return  (key + (i * i)) % capacity;
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
        QuadraticHashing quadraticHashing = new QuadraticHashing(7);
        quadraticHashing.print();
        quadraticHashing.insert(30);
        quadraticHashing.insert(80);
        quadraticHashing.print();

        quadraticHashing.insert(31);
        quadraticHashing.print();

        quadraticHashing.insert(15);
        quadraticHashing.print();

        quadraticHashing.insert(14);
        quadraticHashing.print();

        System.out.println(quadraticHashing.search(14));
        System.out.println(quadraticHashing.search(31));
        System.out.println(quadraticHashing.search(67));

        quadraticHashing.remove(15);
        quadraticHashing.print();

        quadraticHashing.remove(31);
        quadraticHashing.print();

    }
}
