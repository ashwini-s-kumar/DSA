package com.topicwise.searching.difficult;

public class SquareRoot {
    public static int sqFloorRoot(int x){
        int low = 0, high = x, mid, ans = -1;
        while(low <= high){
            mid = (low + high) / 2;
            int sq = mid * mid;
            if(sq == x){
                return mid;
            }
            else if(sq > x){
                high = mid -1;
            }else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String [] arr){
        System.out.println(sqFloorRoot(9));
        System.out.println(sqFloorRoot(5));
        System.out.println(sqFloorRoot(25));
        System.out.println(sqFloorRoot(10));
    }
}
