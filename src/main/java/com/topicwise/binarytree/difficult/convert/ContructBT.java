package com.topicwise.binarytree.difficult.convert;

import com.topicwise.binarytree.Node;

public class ContructBT {
    static int preIndex=0;
    public static Node constructBT(int [] inOrder, int [] preOrder, int inOrderSTIndex, int inOrderEDIndex)
    {
        if(inOrderSTIndex>inOrderEDIndex)
            return null;
        Node root = new Node(preOrder[preIndex++]);
        int inIndex =inOrderSTIndex;
        for(int i=inOrderSTIndex;i<=inOrderEDIndex;i++)
        {
            if(inOrder[i] == root.data) {
                inIndex = i;
                break;
            }
        }
        root.left = constructBT(inOrder,preOrder,inOrderSTIndex,inIndex-1);
        root.right = constructBT(inOrder,preOrder,inIndex+1,inOrderEDIndex);
        return root;
    }
}
