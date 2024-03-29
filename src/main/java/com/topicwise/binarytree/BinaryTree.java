package com.topicwise.binarytree;

import com.topicwise.binarysearchtree.easy.InsertIntoBST;

/**
 *
 * @author ashwini.s
 */
public class BinaryTree {
    /*
             10
       2           15
    4      5     6     7
     */
    public static  Node getSimpleBinaryBT()
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(15);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        return root;
    }
    /*
               20
          8            12
       3      5
    */
    public static Node getChildSumPropertyBT()
    {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right= new Node(5);
        return root;
    }
    /*
                    10
            2              5
       3          4
    20    1    7     8
     */

    public static Node getUnBalancedBT()
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right= new Node(4);
        root.left.left.left = new Node(20);
        root.left.left.right = new Node(1);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(8);
        return root;
    }

    public static  NodeHD getSimpleBinaryBTwithHD()
    {
        /*
                           10
                       2       15
                     4    5  6     7
         */
        NodeHD root = new NodeHD(10);
        root.left = new NodeHD(2);
        root.right = new NodeHD(15);
        root.left.left = new NodeHD(4);
        root.left.right = new NodeHD(5);
        root.right.left = new NodeHD(6);
        root.right.right = new NodeHD(7);
        return root;
    }

    /*
                                    50
                     20                         100
                10          40            70              120
           4                          60      80
     */

    public static NodeLCount getAugmentedBST(){

        NodeLCount root = new NodeLCount(50);
        InsertIntoBST.insertIntoAugmentedBST(root, 20);
        InsertIntoBST.insertIntoAugmentedBST(root, 100);
        InsertIntoBST.insertIntoAugmentedBST(root, 10);
        InsertIntoBST.insertIntoAugmentedBST(root, 40);
        InsertIntoBST.insertIntoAugmentedBST(root, 70);
        InsertIntoBST.insertIntoAugmentedBST(root, 120);
        InsertIntoBST.insertIntoAugmentedBST(root, 4);
        InsertIntoBST.insertIntoAugmentedBST(root, 60);
        InsertIntoBST.insertIntoAugmentedBST(root, 80);
        return root;
    }

    // wrong BST - 2 elements are swapped
    /*
                            20
                  60                      80
            4          10           8          100
     */
    public static Node getSwappedBST()
    {
        Node root = new Node(20);
        root.left = new Node(60);
        root.right = new Node(80);

        root.left.left = new Node(4);
        root.left.right= new Node(10);

        root.right.left = new Node(8);
        root.right.right = new Node(100);
        return root;
    }


}
