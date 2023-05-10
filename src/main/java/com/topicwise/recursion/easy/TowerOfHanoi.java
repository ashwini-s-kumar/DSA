package com.topicwise.recursion.easy;

public class TowerOfHanoi {


    public static long toh(int N, int from, int to, int aux) {
        // Your code here
        long moves = 0L;
        if(N >= 1){

            moves  += toh(N-1, from, aux, to );
            System.out.println("move disk "+ N + " from rod "+ from +" to rod " + to);
            moves ++;
            moves += toh(N-1, aux, to, from  );
        }

        return moves;
    }

    public static void main(String [] arr){
        System.out.println(toh(3, 1, 3, 2));
    }
}
