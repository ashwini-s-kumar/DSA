package com.topicwise.searching.medium;

public class FindPeakUnsortedArray {
    public static int peak(int [] arr){
        int l = 0,  h  = arr.length -1, mid;
        while(l <= h){
            mid = (l +h) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length -1 || arr[mid+1] <= arr[mid])){
                return mid;
            }else if(mid > 0 && arr[mid-1] >= arr[mid]){
                h = mid -1;
            }else{
                l = mid +1;
            }
        }
        return -1;
    }

    public static void main(String [] a){
        int [] arr = {2,9,5,4,3,6,7};
        System.out.println(peak(arr));
        System.out.println(peak(arr));
    }
}
