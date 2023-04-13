package com.topicwise.searching.difficult;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AllocateMinPagesAmongStudents {
    // k = no of students
    public static int minPage(int [] arr, int k){
        int l = 0 , h = 0, mid, res = -1;
        for(int i = 0; i < arr.length; i++){
            l = Math.max( l ,arr[i]);
            h += arr[i];
        }
        while(l <= h){
            mid = (l + h) /2;
            if(isFeasible(arr, k, mid)){
                res = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return res;
    }

    public static boolean isFeasible(int [] arr, int k, int res){
        int stu = 1, sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(sum + arr[i] > res){
                stu++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }
        return stu <= k;
    }

    public static void main(String [] arr){
        int [] a = {10, 10, 20, 30};
        System.out.println(minPage(a, 2));
    }
}
