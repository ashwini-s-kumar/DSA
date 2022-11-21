package com.topicwise.binarytree.convert;

import com.topicwise.binarytree.Node;

import java.util.ArrayList;

public class SerializePreOrderApproach {
    static int empty = -1;
    public static ArrayList<Integer> serialize(Node root, ArrayList<Integer> arr)
    {
        if(root == null)
        {
            arr.add(empty);
            return arr;
        }
        arr.add(root.data);
        serialize(root.left,arr);
        serialize(root.right,arr);
        return arr;
    }
}
