package com.topicwise.searching.easy;

public class BinarySearch {

    public static int iterativeBS(int[] arr, int key) {

        int l = 0, h = arr.length - 1;
        int mid;
        while (l <= h) {
            mid = (l + h) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveBS(int[] arr, int l, int h, int key) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h) / 2;

        if (key == arr[mid]) {
            return mid;
        } else if (key < arr[mid]) {
            return recursiveBS(arr, l, mid - 1, key);
        } else {
            return recursiveBS(arr, mid + 1, h, key);
        }
    }

    public static void main(String[] arr) {

        int[] array1 = {10, 20, 30, 40, 50};
        System.out.println(iterativeBS(array1, 40));
        System.out.println(iterativeBS(array1, 17));

        System.out.println(recursiveBS(array1, 0, array1.length - 1, 40));
        System.out.println(recursiveBS(array1, 0, array1.length - 1, 17));
    }
}
