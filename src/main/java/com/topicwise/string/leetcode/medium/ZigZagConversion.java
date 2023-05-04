package com.topicwise.string.leetcode.medium;

import java.util.Arrays;

public class ZigZagConversion {

    // time - O(n), space - O(n)
    private static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder answer = new StringBuilder();
        int n = s.length();
        int charsInSection = 2 * (numRows - 1);

        for (int currRow = 0; currRow < numRows; ++currRow) {
            int index = currRow;

            while (index < n) {
                answer.append(s.charAt(index));

                // If currRow is not the first or last row
                // then we have to add one more character of current section.
                if (currRow != 0 && currRow != numRows - 1) {
                    int charsInBetween = charsInSection - 2 * currRow;
                    int secondIndex = index + charsInBetween;

                    if (secondIndex < n) {
                        answer.append(s.charAt(secondIndex));
                    }
                }
                // Jump to same row's first character of next section.
                index += charsInSection;
            }
        }

        return answer.toString();
    }

    // time - O(numRows * n), space - O(numRows * n)
    private static String convert2(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int n = s.length();
        int sections = (int) Math.ceil(n / (2 * numRows - 2.0));
        int numCols = sections * (numRows - 1);

        char[][] matrix = new char[numRows][numCols];
        for (char[] row: matrix) {
            Arrays.fill(row, ' ');
        }

        int currRow = 0, currCol = 0;
        int currStringIndex = 0;

        // Iterate in zig-zag pattern on matrix and fill it with string characters.
        while (currStringIndex < n) {
            // Move down.
            while (currRow < numRows && currStringIndex < n) {
                matrix[currRow][currCol] = s.charAt(currStringIndex);
                currRow++;
                currStringIndex++;
            }

            currRow -= 2;
            currCol++;

            // Move up (with moving right also).
            while (currRow > 0 && currCol < numCols && currStringIndex < n) {
                matrix[currRow][currCol] = s.charAt(currStringIndex);
                currRow--;
                currCol++;
                currStringIndex++;
            }
        }

        StringBuilder answer = new StringBuilder();
        for (char[] row: matrix) {
            for (char character: row) {
                if (character != ' ') {
                    answer.append(character);
                }
            }
        }

        return answer.toString();
    }
    public static void main(String [] arr){
        String str = "PAYPALISHIRING";
        /*
        if numRows = 3
                P L I G
                APIHRN
                Y S I
         */

        /*
        if numRows = 5
                P   I
                A  HR
                Y S I
                AI  N
                L   G
         */
        System.out.println(convert(str, 3));
        //System.out.println(convert2(str, 3));
    }
}
