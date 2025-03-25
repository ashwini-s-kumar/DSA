package com.topicwise.recursion.easy;

public class BasicProblems {



  static void printName(int i, int n) {
    if(i > n) {
      return;
    }
    System.out.println(i + "=" + "Ash");
    printName(i+1, n);
  }

  static void printLinearly1ToN(int i, int n) {
    if (i > n) {
      return;
    }
    System.out.println(i);

    printLinearly1ToN(i + 1, n);
  }

  static void printNTo1(int n) {
    if(n < 1){
      return;
    }
    System.out.println(n);
    printNTo1(n-1);
  }

  static void print1ToNBackTracking(int i , int n) {
    if(i < 1) {
      return;
    }
    print1ToNBackTracking(i-1, n);
    System.out.println(i);
  }

  static void printNTo1BackTracking(int i , int n) {
    if(i > n) {
      return;
    }
    print1ToNBackTracking(i+1, n);
    System.out.println(i);
  }


  public static void main(String [] arrs){
//    printName(1, 5);
//    printLinearly1ToN(1, 5);
//    printNTo1(5);
//    print1ToNBackTracking(3,3);
    printNTo1BackTracking(1, 3);
  }
}
