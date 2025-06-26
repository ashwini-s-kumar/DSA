package com.topicwise.recursionAndBacktracking.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPermutationsOfString {
    private static void permutations(int ind, int [] a, List<List<Integer>> ans){
        if(ind == a.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < a.length; i++) {
                ds.add(a[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i = ind; i < a.length; i++){
            swap(a, ind, i);
            permutations(ind + 1, a, ans);
            swap(a, ind, i);
        }
    }



    private static void swap(int [] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //permutations  = n! =
    // 3! = 3 * 2 * 1 = 6
    public static void main(String[] args)
    {
        // 2nd sol : efficient
        int a[] = {1,2,3};
        List<List<Integer>> ans2 = new ArrayList<>();
        permutations(0, a, ans2);
        System.out.println(ans2);

        // 1st sol : sc is high due to ds and map

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans1 = new ArrayList<>();
        findPermutations(a, ds, map, ans1);
        System.out.println(ans1);
    }

    private static void findPermutations(int[] a, List<Integer> ds, Map<Integer, Integer> map, List<List<Integer>> ans) {
        if(ds.size() == a.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < a.length; i ++) {
            if(map.get(a[i]) == 0) { // not picked
                ds.add(a[i]);
                map.put(a[i], 1);
                findPermutations(a, ds, map, ans);

                ds.remove(ds.size() - 1);
                map.put(a[i], 0);
            }
        }
    }
}
