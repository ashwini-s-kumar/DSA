package com.dsa.heap;

public class HeapExecutor {
    public static void main(String [] arr)
    {
        PurchaseMaxItems purchaseMaxItems = new PurchaseMaxItems();
        MedianOfStream medianOfStream = new MedianOfStream();
        int [] items = { 1,12,5,111,200};
        int noOfItems = purchaseMaxItems.purchase(items, 10);
        System.out.println(" The items purchased :"+noOfItems);


        int [] medianStream = new int[]{5, 15, 10, 20, 3};
        medianOfStream.median(medianStream);
        /*5
10
10
12.5
10*/
    }
}



