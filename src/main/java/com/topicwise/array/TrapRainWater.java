package com.topicwise.array;

import com.topicwise.math.Arithmetics;

public class TrapRainWater {

    public int rainWater(int [] arr)
    {
        int [] lMax = new int[arr.length];
        int [] rMax = new int[arr.length];
        int rain = 0;
        lMax[0] = arr[0];
        rMax[rMax.length -1] = arr[arr.length -1];
         for(int i = 1; i < arr.length; i++)
         {
             lMax[i] = Arithmetics.max(lMax[i-1],arr[i]);
         }

        for(int i = arr.length - 2; i >= 0; i--)
        {
            rMax[i] = Arithmetics.max(rMax[i+1],arr[i]);
        }

        for(int i=0; i< arr.length; i++)
        {
            rain = rain + Math.abs(Arithmetics.min(lMax[i],rMax[i]) - arr[i]);
        }

        return rain;
    }
}
