package com.topicwise.array.medium.prefixSum;

public class MaxOccurenceInRange {
    private static int [] fre = new int[101];

    private static void buildFre(int [] left, int [] right){
        for(int i = 0; i < left.length; i++){
            fre[left[i]] ++;
            fre[right[i]+ 1 ] --;
        }
        for(int i = 1; i < 100; i++){
            fre[i] =  fre[i-1] + fre[i];
        }
    }

    private static void maxOccurenceInRange(){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < fre.length; i++){
            if(fre[i] > max){
                max = i;
            }
        }
        System.out.println("The max occurence is : " + max);
    }

    public static void main(String [] arr){
        int [] l = {1, 2, 5, 15};
        int [] r = {5, 8, 7, 18};
        buildFre(l, r);
        maxOccurenceInRange();
    }
}
