package com.topicwise.array.easy;

public class LowerAndUpperBound {
  public static int lowerBound(int [] a, int key){
    // smaller index such that the a[index] >= key
    int  lowerBound = a.length;

    int low = 0, high = lowerBound - 1, mid;

    while(low <= high){
      mid = (low + high) / 2;
      if(a[mid] < key){
        low = mid + 1;
      }else {
        lowerBound = mid;
        high = mid - 1;
      }
    }

    return lowerBound;
  }

  public static int upperBound(int [] a, int key){
    // largest index such that the a[index] <= key
    int  upperBound = a.length;

    int low = 0, high = upperBound - 1, mid;

    while(low <= high){
      mid = (low + high) / 2;
      if(a[mid] > key){
        high = mid - 1;
      }else {
        upperBound = mid;
        low = mid + 1;
      }
    }

    return upperBound;
  }

  public static void main(String  [] arr){
    int a[] = {1, 2, 3, 3, 7, 9, 9 ,9 ,11};
    System.out.println( " lower bound of 9 : " + lowerBound(a, 9)); // 5
    System.out.println( " upper bound of 9 : " + upperBound(a, 9)); // 7
    System.out.println( " upper bound of 8 : " + upperBound(a, 8)); // 4
  }
}
