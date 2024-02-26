package com.topicwise.mathematics.easy;
/*
Input:  n = 100
 Output: 1 2 4 5 10 20 25 50 100

 If we look carefully, all the divisors are present in pairs.

For example if n = 100, then the various pairs of divisors are: (1,100), (2,50), (4,25), (5,20), (10,10)

Using this fact we could speed up our program significantly. We, however, have to be careful if there are two equal divisors as in the case of (10, 10). In such case, we’d print only one of them.

We iterate through all numbers from 1 to square root of n in this case.

Time Complexity: O(sqrt(n))

Auxiliary Space: O(1)
 */
public class PrintAllDivisors {
  static void printDivisors(int n)
  {
    for(int i=1; i*i <= n; i++)
    {
      if(n % i == 0)
      {
        System.out.print(i+" ");

        if(i != n / i)
          System.out.print((n / i)+" ");
      }
    }
  }

  public static void main (String[] args) {

    int n = 100;

    printDivisors(n);

  }
}
