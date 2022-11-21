package com.topicwise.binarytree.convert;

import com.topicwise.binarytree.Node;

public class DeserializePerOrderApproach {
    static int empty = -1, index =0;
    public static Node deserialize(int [] arr)
    {
        if(arr.length == index)
            return null;
        int val = arr[index];
        index++;
        if(val == empty)
            return null;
        Node root = new Node(val);
        root.left = deserialize(arr);
        root.right = deserialize(arr);
        return root;
    }
}
