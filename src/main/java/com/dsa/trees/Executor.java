package com.dsa.trees;

import com.dsa.trees.patterns.LeftView;
import com.dsa.trees.patterns.PrintKthLevel;
import com.dsa.trees.properties.*;
import com.dsa.trees.traversals.*;
/**
 *
 * @author ashwini.s
 */
public class Executor {
    public static void main(String [] arr)
    {
        Node simpleBinaryBT = BinaryTree.getSimpleBinaryBT();

        System.out.println("");
        System.out.println("inOrder traversal of simpleBinaryBT:");
        InOrder.inOrder(simpleBinaryBT);

        System.out.println("");
        System.out.println("preOrder traversal of simpleBinaryBT:");
        PreOrder.preOrder(simpleBinaryBT);

        System.out.println("");
        System.out.println("postOrder traversal of simpleBinaryBT:");
        PostOrder.postOrder(simpleBinaryBT);

        System.out.println("");
        System.out.println("height of simpleBinaryBT: "+ HeightBt.heightBt(simpleBinaryBT));

        System.out.println("");
        System.out.println("levelOrder traversal of simpleBinaryBT:");
        LevelOrder.levelOrder(simpleBinaryBT);

        System.out.println("");
        System.out.println("levelOrderLineWiseNull traversal of simpleBinaryBT:");
        LevelOrderLineWiseNull.levelOrderLineWiseNull(simpleBinaryBT);

        System.out.println("");
        System.out.println("levelOrderLineWise traversal of simpleBinaryBT:");
        LevelOrderLineWise.levelOrderLineWise(simpleBinaryBT);

        System.out.println("");
        System.out.println("leftView traversal of simpleBinaryBT:");
        LeftView.leftView(simpleBinaryBT);

        System.out.println("");
        System.out.println("sizeBT  of simpleBinaryBT: " + SizeBT.sizeBT(simpleBinaryBT));

        System.out.println("");
        System.out.println("maxOfBT  of simpleBinaryBT: " + MaxOfBT.maxOfBT(simpleBinaryBT));

        Node childSumPropertyBT = BinaryTree.getChildSumPropertyBT();
        System.out.println("");
        System.out.println("Does childSumPropertyBT follow childSumProperty: " + ChildSumProperty.childSumProperty(childSumPropertyBT));

        System.out.println("");
        System.out.println("Does simpleBinaryBT follow childSumProperty: " + ChildSumProperty.childSumProperty(simpleBinaryBT));

        Node unBalancedBT = BinaryTree.getUnBalancedBT();
        System.out.println("");
        System.out.println("Does unBalancedBT balanced " + BalancedBT.isBalancedBT(unBalancedBT));

        System.out.println("");
        System.out.println("Does simpleBinaryBT balanced " + BalancedBT.isBalancedBT(simpleBinaryBT));

        System.out.println("");
        System.out.println("printKthLevel traversal of simpleBinaryBT:");
        PrintKthLevel.printKthLevel(simpleBinaryBT,2);
    }
}
