package com.topicwise.mathematics.easy;

public class GeometricProgression {
  static int NthTermInGP(int n, int a, int b){
    /*
    Step 1- Find the value of r by r=B/A.
    Step 2- Return A*pow(r,N-1)
     */

    int r = b / a;
    return a * ComputingPower.powerIterative(r, n - 1);
  }

  public static void main(String [] a){
    System.out.println(NthTermInGP(5, 1, 2));
  }
}
