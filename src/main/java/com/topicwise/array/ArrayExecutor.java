package com.topicwise.array;

import com.topicwise.array.kadaneAlgo.LongestEvenOddSubArray;
import com.topicwise.array.kadaneAlgo.MaxCircularSumSubArray;
import com.topicwise.array.kadaneAlgo.MaxSubArraySum;
import com.topicwise.array.mooreVotingAlgo.MajorityElement;
import com.topicwise.array.patterns.PascalTriangle;
import com.topicwise.array.slidingWindow.CheckSubArrWithGivenSum;
import com.topicwise.array.slidingWindow.DistinctElementInEveryWindow;
import com.topicwise.array.slidingWindow.MaxSumOfKConsecutiveElements;

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
        Frequency frequency = new Frequency();
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
        UnionIntersection unionIntersection = new UnionIntersection();
        MinConsecutiveFlips minConsecutiveFlips = new MinConsecutiveFlips();
        MaxSumOfKConsecutiveElements maxSumOfKConsecutiveElements = new MaxSumOfKConsecutiveElements();
        CheckSubArrWithGivenSum checkSubArrWithGivenSum = new CheckSubArrWithGivenSum();
        DistinctElementInEveryWindow distinctElementInEveryWindow = new DistinctElementInEveryWindow();

        int [] larNum = {3,30,34,5,9};
        System.out.println(" ");
        String res = CreateLargeNumberFromArray.largestNumber(larNum);
        System.out.println("The larget number = "+ res);
        int [] moveNumber = {2, 1, 2, 2, 2, 3, 4, 2};
        int toMove = 2;
        System.out.println("The given array is " );
        printArray.print(moveNumber);
        System.out.println(" , toMove = "+toMove+ ", array after moving "+ toMove);
        MoveNumberToEndOfArray.moveAllInstancesToEnd(moveNumber, toMove);

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
        printArray.print(arr1);
        System.out.print( " is : ");
        rev.reverseArray(arr1, 0, arr1.length-1);
        printArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Left Rotate by 1 position of the  array : ");
        printArray.print(arr1);
        System.out.print( " is : ");
        leftRotateArray.leftRotateByOne(arr1);
        printArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Left Rotate by d position of the  array : ");
        printArray.print(arr1);
        System.out.print( " is : ");
        leftRotateArray.leftRotateByDPos(arr1, 3);
        printArray.print(arr1);

        System.out.println(" ");
        System.out.print(" Remove Duplicates of the sorted array : ");
        int [] arr2 = {12, 17, 17, 23, 27, 35, 35, 46, 50, 60, 70, 70};
        printArray.print(arr2);
        System.out.print( " is : ");
        int lastIndex = removeDupSortedArray.removeDuplicates(arr2);
        printArray.print(arr2,lastIndex);

        System.out.println(" ");
        System.out.print(" Second Largest in the given array : ");
        int [] arr3 = {30, 50, 70, 20, 90, 500, 420,40};
        printArray.print(arr3);
        System.out.print( " is : " + secondLargestNumber.secondLargest(arr3));

        System.out.println(" ");
        System.out.print(" arr2: ");
        printArray.print(arr2);
        System.out.print(" arr3: ");
        printArray.print(arr3);
        System.out.print(" union :  ");
        unionIntersection.union(arr2, arr3);
        System.out.print(" intersection :  ");
        unionIntersection.intersection(arr2, arr3);

        System.out.println(" ");
        System.out.print(" Leaders of  the given array : ");
        int [] arr4 = {30, 2000, 70, 1000, 90, 500, 420,40};
        leader.printLeader(arr4);

        System.out.println(" ");
        System.out.print(" MaxDifference in  of   given array : ");
        printArray.print(arr4);
        System.out.print( " is : "+ maxDifference.maxDiff(arr4));

        System.out.println(" ");
        System.out.print(" Frequency of element in sorted array : ");
        int [] arr5 = {10,10,10,35,35,60,60,60,60,60,70,80,80};
        printArray.print(arr5);
        frequency.freSortedArray(arr5);

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
        System.out.print(" Longest Even Odd  of subArray in the given array : ");
        int [] arr7 = {1,2,3,1,4,5,6,7,8,8};
        printArray.print(arr7);
        System.out.print( " is : "+ longestEvenOddSubArray.longestEvenOddSubArray(arr7));

        System.out.println(" ");
        System.out.print(" Max Sum of Circular subArray in the given array : ");
        printArray.print(arr6);
        System.out.print( " is : "+ maxCircularSumSubArray.maxCircularSumSubArray(arr6));

        System.out.println(" ");
        System.out.print(" Majority element in the given array : ");
        int [] arr8 = { 1, 3, 3, 1, 3};
        printArray.print(arr8);
        majorityElement.printMajority(arr8);

        System.out.println(" ");
        System.out.print(" Rain Water in the given array : ");
        int [] arr9 = { 12, 11, 10, 9};
        printArray.print(arr9);
        System.out.print(" is : ");
        System.out.print(trapRainWater.rainWater(arr9));

        System.out.println(" ");
        System.out.print(" MIssing number in the given array : ");
        int [] arr10 = { 1, 3, 4, 5};
        printArray.print(arr10);
        System.out.print(" is : ");
        System.out.print(missingNumber.missingNumber(arr10));

        System.out.println(" ");
        System.out.print(" move negative numbers in the given array : ");
        int [] arr11 = { 1, -3, 4, -5 , -100, -8, 7, 10, -23, 18};
        printArray.print(arr11);
        System.out.print(" is : ");
        moveNegativeToEndOfArray.moveNegative(arr11);

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
        int [] arr14 = { 1, 1, 0, 0, 0, 1,1,0};
        printArray.print(arr14);
        minConsecutiveFlips.makeAllElementsSame(arr14);

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
