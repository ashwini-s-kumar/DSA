package com.topicwise.array;

public class Frequency {
    public void freSortedArray(int [] arr)
    {
        int fre = 1, i = 1;
        while(i < arr.length)
        {
            while(i < arr.length && arr[i] == arr[i-1])
            {
                fre++;
                i++;
            }
            System.out.print(" ele "+arr[i-1]+" : "+fre +". " );
            fre=1;
            i++;
        }
    }
    public void freUnsortedArray(int [] arr)
    {

    }
}
