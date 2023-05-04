package com.topicwise.array;

import com.topicwise.array.difficult.KthLargest;
import com.topicwise.array.difficult.KthSmallest;
import com.topicwise.array.difficult.StockBuySell;
import com.topicwise.array.difficult.TrapRainWater;
import com.topicwise.array.easy.*;
import com.topicwise.array.medium.kadaneAlgo.LongestEvenOddSubArray;
import com.topicwise.array.medium.kadaneAlgo.MaxCircularSumSubArray;
import com.topicwise.array.medium.kadaneAlgo.MaxSubArraySum;
import com.topicwise.array.medium.mooreVotingAlgo.MajorityElement;
import com.topicwise.array.medium.patterns.PascalTriangle;
import com.topicwise.array.medium.slidingWindow.CheckSubArrWithGivenSum;
import com.topicwise.array.medium.slidingWindow.DistinctElementInEveryWindow;
import com.topicwise.array.medium.slidingWindow.MaxSumOfKConsecutiveElements;
import com.topicwise.hashing.easy.UnionIntersectionOfArr;

public class ArrayExecutor {
    public static void main(String [] arr)
    {
        PrintArray printArray = new PrintArray();
        ReverseArrayTwoPointer rev = new ReverseArrayTwoPointer();
        PascalTriangle pascalTriangle = new PascalTriangle();
        LeftRotateArray leftRotateArray = new LeftRotateArray();
        RemoveDuplicatesSortedArray removeDupSortedArray = new RemoveDuplicatesSortedArray();
        SecondLargestNumber secondLargestNumber = new SecondLargestNumber();
        Leader leader = new Leader();
        MaxDifference maxDifference = new MaxDifference();
        FrequencySortedArray frequency = new FrequencySortedArray();
        StockBuySell stockBuySell = new StockBuySell();
        MaxConsecutive1sBinaryArray max1sBinaryArray = new MaxConsecutive1sBinaryArray();
        MaxSubArraySum maxSubArraySum = new MaxSubArraySum();
        LongestEvenOddSubArray longestEvenOddSubArray = new LongestEvenOddSubArray();
        MaxCircularSumSubArray maxCircularSumSubArray = new MaxCircularSumSubArray();
        MajorityElement majorityElement = new MajorityElement();
        TrapRainWater trapRainWater = new TrapRainWater();
        MissingNumber missingNumber = new MissingNumber();
        MoveNegativeToEndOfArray moveNegativeToEndOfArray = new MoveNegativeToEndOfArray();
        KthSmallest kthSmallest = new KthSmallest();
        KthLargest kthLargest = new KthLargest();
        Sort012 sort012 = new Sort012();
        UnionIntersectionOfArr unionIntersection = new UnionIntersectionOfArr();
        MinConsecutiveFlips minConsecutiveFlips = new MinConsecutiveFlips();
        MaxSumOfKConsecutiveElements maxSumOfKConsecutiveElements = new MaxSumOfKConsecutiveElements();
        CheckSubArrWithGivenSum checkSubArrWithGivenSum = new CheckSubArrWithGivenSum();
        DistinctElementInEveryWindow distinctElementInEveryWindow = new DistinctElementInEveryWindow();

        int [] larNum = {3,30,34,5,9};
        System.out.println(" ");
        String res = CreateLargeNumberFromArray.largestNumber(larNum);
        System.out.println("The larget number = "+ res);

        System.out.println(" ");
        System.out.println("print full pascal triangle with row : 6");
        pascalTriangle.print(25);

        System.out.println(" ");
        System.out.println("print row pascal triangle with row : 6");
        int [] row = pascalTriangle.getRow(25);
        printArray.print(row);

        System.out.println(" ");
        System.out.print(" Reverse of the  array : ");
        int [] arr1 = {100, 90, 80, 70, 60, 50, 40};




        System.out.println(" ");
        System.out.print(" Leaders of  the given array : ");
        int [] arr4 = {30, 2000, 70, 1000, 90, 500, 420,40};

        System.out.println(" ");
        System.out.print(" MaxDifference in  of   given array : ");
        printArray.print(arr4);
        System.out.print( " is : "+ maxDifference.maxDiff(arr4));


        System.out.println(" ");
        System.out.print(" Trade stocks with the price array : ");
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        printArray.print(price);
        stockBuySell.stock(price);

        System.out.println(" ");
        System.out.print(" Max 1's in the binary array : ");
        int [] binary = {1,1,1,0,0,0,1,1,0,1,1,1,1,1,0,1};
        printArray.print(binary);
        System.out.print( " is : "+ max1sBinaryArray.max1s(binary));

        System.out.println(" ");
        System.out.print(" Max Sum of subArray in the given array : ");
       // int [] arr6 = {1,2, 3, -7, 8,1};
        int [] arr6 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printArray.print(arr6);
        System.out.print( " is : "+ maxSubArraySum.maxSubArraySum(arr6));



        System.out.println(" ");
        System.out.print(" Max Sum of Circular subArray in the given array : ");
        printArray.print(arr6);
        System.out.print( " is : "+ maxCircularSumSubArray.maxCircularSumSubArray(arr6));

        System.out.println(" ");
        System.out.print(" Majority element in the given array : ");
        int [] arr8 = { 1, 3, 3, 1, 3};
        printArray.print(arr8);
        majorityElement.printMajority(arr8);





        int [] arr12 = { 1, 3, 4, 5 , 100, 8, 7, 10, 23, 18};
        int k = 7;

        System.out.println(" ");
        System.out.print(" The " + k+"th move smallest no. in the given array : ");
        printArray.print(arr12);
        System.out.print("---> is : " +kthSmallest.kthSmallest(arr12,0,arr12.length-1,k));

        System.out.println(" ");
        System.out.print(" The " + k+"th move Largest no. in the given array : ");
        printArray.print(arr12);
        System.out.print("---> is : " +kthLargest.kthLargest(arr12,0,arr12.length-1,k));

        System.out.println(" ");
        System.out.print(" The given array : ");
        int [] arr13 = { 1, 0, 0, 2, 2, 2, 1, 0, 1, 0, 0, 2, 1, 2};
        printArray.print(arr13);
        System.out.print("After sort012 :");
        sort012.sort012(arr13, arr13.length);
        printArray.print(arr13);


        System.out.println(" ");
        System.out.print(" The given array : ");
        int [] arr15 = {1, 4, 20, 3, 10, 5};
        printArray.print(arr15);
        maxSumOfKConsecutiveElements.maxSum(arr15, 3);

        System.out.println(" ");
        System.out.print(" The given array : ");
        printArray.print(arr15);
        checkSubArrWithGivenSum.checkSubArrayExist(arr15, 33);

        System.out.println(" ");
        System.out.print(" The given array : ");
        int [] arr16 = {1, 1, 1, 3, 4, 2, 3};
        printArray.print(arr16);
        distinctElementInEveryWindow.distinct(arr16, 4);

    }
}
