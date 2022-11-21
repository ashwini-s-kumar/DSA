package com.topicwise.linkedlist.operations;
import com.topicwise.linkedlist.Node;
public class MergeKSortedLL {
    public static Node mergeKLists(Node arr[], int last)
    {
        MergeTwoSortedLL mergeTwoSortedLL = new MergeTwoSortedLL();
        // repeat until only one list is left
        while (last != 0) {
            int i = 0, j = last;

            // (i, j) forms a pair
            while (i < j) {
                // merge List i with List j and store
                // merged list in List i
                arr[i] = mergeTwoSortedLL.mergeTwoSortedLLRecursion(arr[i], arr[j]);

                // consider next pair
                i++;
                j--;

                // If all pairs are merged, update last
                if (i >= j)
                    last = j;
            }
        }

        return arr[0];
    }
}
