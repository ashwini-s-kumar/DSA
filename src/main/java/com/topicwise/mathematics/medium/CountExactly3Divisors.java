package com.topicwise.mathematics.medium;

import com.topicwise.mathematics.easy.CheckPrime;

public class CountExactly3Divisors {

  static int exactly3Divisors(int N)
  {
    int counter=0;

    //Running a loop from 1 to sqrt(N)
    for(int i=1;i * i <= N;i++)
    {
      // A number N only has 3 divisors if it is a
      // perfect square and its square  root is a prime number,
      // and we know the number of perfect squares less than N which
      // is sqrt(N), so just checking if i is prime or not
      if(CheckPrime.isPrime(i)) { // O(sqrt(n))
        counter++;
      }
    }
    return counter;
  }

  public static void main(String [] a){
    System.out.println(exactly3Divisors(6));
  }
}
