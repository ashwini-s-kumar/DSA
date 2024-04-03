package com.topicwise.backtracking;

public class BlackWhiteNonAttackingKnights {

  /*
  Expected Time Complexity: O(N*M).
  Expected Auxiliary Space: O(1).
  */

  public static int numOfWays(int n, int m){
    int count = 0;
    int attacks = 0;
    int mod = 1000000007;
    int totalPositions = n * m;

    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        attacks = findAttacks(i, j, n, m) + 1;
        count += totalPositions - attacks;
      }
    }
    return count % mod;
  }

  private static int findAttacks(int i, int j, int n, int m) {
    int valid = 0;
    int [][] directions = {{-2, -1}, {-2, 1}, {2, -1}, {2, 1}, {-1,-2}, {-1, 2}, {1,-2}, {1,2}};
    for(int k = 0; k < 8 ; k++){
      if(isValid(i + directions[k][0], j + directions[k][1], n, m)){
        valid++;
      }
    }
    return valid;
  }

  private static boolean isValid(int i, int j, int n, int m) {
    if(i >= 0 && j >= 0 && i < n && j < m){
      return true;
    }
    return false;
  }

  public static void main(String [] arr){
    int n = 2, m = 3;
    int count = numOfWays(n, m);
    System.out.println("num of arrangements : " +count);
  }
}
