package com.topicwise.mathematics.easy;

public class CountTrailingZeroInFactorial {
  /*
  we get 0 when we have one : 2 * 5.
  during factorial the 5's are also more that 2's
  So, just count the number of 5's
  1 2 3 4 5 6 7 8 9 10  11  12  13 14 15  16 ......20 ......25
         5          5*2              5*3          5*2*2     5*5 // PRIME FACTORS
         1           1                1            1        2

         n/5 = will give all 1:  5 prime factors
         n/25 = will give the another 1:  5 prime factors where there is 2 :  5 prime factors
         n / 125 = will give the another 1:  5 prime factors where there is 3 :  5 prime factors
         .. so on
   */
  static int trailingZero(int n){
    int res = 0;

    for( int i = 5 ; i <= n; i = i * 5){
      res = res + ( n / i);
    }
    return  res ;
  }
  public static void main(String [] arr){
    System.out.println("100 : "+ trailingZero(100));
    System.out.println(" 5: "+ trailingZero(5));
  }
}
