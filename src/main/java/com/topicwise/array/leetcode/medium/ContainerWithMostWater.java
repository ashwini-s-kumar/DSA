package com.topicwise.array.leetcode.medium;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right){
            int width = right - left;
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * width);

            if(height[left] <= height[right]){
                left ++;
            }else{
                right --;
            }
        }

        return maxArea;
    }

    public static void main(String [] arr){
        int [] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(array));

        int [] array2 = { 12, 11, 10, 12};
        System.out.println(maxArea(array2));
    }
}

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
 */
