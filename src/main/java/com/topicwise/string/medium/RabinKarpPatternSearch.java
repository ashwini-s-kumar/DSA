package com.topicwise.string.medium;

import java.util.ArrayList;
import java.util.List;

public class RabinKarpPatternSearch {

    /*
    - like Naive approach , slide the pattern one by one
    - Compare hash values of pattern and current text window.
      If hash values matches, then only compare the individual characters
     */

    static final int BASE = 256;

    static final int MODULUS = Integer.MAX_VALUE;

    static void RBSearch(String pat, String txt, int M, int N) {

        //Compute p and to
        int patHash = 0, txtHash = 0;
        for (int i = 0; i < M; i++) {
            patHash = (patHash * BASE+ pat.charAt(i)) % MODULUS;
            txtHash = (txtHash * BASE + txt.charAt(i)) % MODULUS;
        }

        for (int i = 0; i <= (N - M); i++) {
            //Check for hit
            if (patHash == txtHash) {
                boolean flag = true;
                for (int j = 0; j < M; j++)
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                if (flag == true) System.out.print(i + " ");
            }
            //Compute ti+1 using ti = this is called rolling hash.
            // t(i+1) = t(i)  - txt[i] + txt[i+m]
            if (i < N - M) {
                txtHash = reHash(txtHash, txt.charAt(i), txt.charAt(i+M), M);

            }
        }
    }

    private static int reHash(int oldHash, char prevChar, char nextChar, int m){
        int newHash = oldHash - prevChar * (int) Math.pow(BASE, m-1);
        newHash = newHash * BASE + nextChar;
        return newHash;
    }

    public static void main(String args[]) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        System.out.print("All index numbers where pattern found: ");
        RBSearch(pat, txt, 4, 15);
    }

}
