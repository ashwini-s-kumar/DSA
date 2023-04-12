package com.topicwise.searching.difficult;

public class MediumOfTwoSortedArray {
    //binary search
    public static double median(int [] arr1, int [] arr2, int n1, int n2){
        if(n1 > n2){
            return median(arr2, arr1, n2, n1);
        }
        int begin1 = 0, end1 = n1, min1, min2, max1, max2, i1, i2;
        while(begin1 <= end1){
            i1 = (begin1 + end1) / 2;
            i2 = (n1 + n2 + 1) / 2 - i1;

            min1 = (i1 == n1) ? Integer.MAX_VALUE : arr1[i1];
            max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[i1-1];

            min2 = (i2 == n2) ? Integer.MAX_VALUE : arr2[i2];
            max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[i2-1];

            if(max1 <= min2 && max2 <= min1){
                if((n1 +n2)%2 ==0){
                    return (double) (Math.max(max1, max2) + Math.min(min1, min2) / 2);
                }else{
                    return  (double) Math.max(max1, max2);
                }
            }
            if (max1 > min2){
                end1 = i1 - 1;
            }else {
                begin1 = i1 + 1;
            }
        }
        return  -1 ;
    }
    public static void main(String [] ar){
        int [] arr1 = {30, 40, 50, 60};
        int [] arr2 = {5, 6, 7, 8, 9};
        System.out.println(median(arr1, arr2, 4, 5));
    }
}
