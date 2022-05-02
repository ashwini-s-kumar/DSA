package com.dsa.trees;

import com.dsa.trees.convert.BinaryTreeToDLL;
import com.dsa.trees.views.*;
import com.dsa.trees.properties.*;
import com.dsa.trees.traversals.*;
import com.dsa.trees.convert.ContructBT;

import java.util.Arrays;

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
        System.out.println("LeftView traversal of simpleBinaryBT:");
        LeftView.leftView(simpleBinaryBT);

        System.out.println("");
        System.out.println("RightView traversal of simpleBinaryBT:");
        RightView.rightView(simpleBinaryBT);

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

        System.out.println("");
        System.out.println("maxWidth of simpleBinaryBT:" + MaxWidthBT.maxWidthBT(simpleBinaryBT));

        System.out.println("");
        System.out.println("BTtoDLL of simpleBinaryBT: ");
        PrintList.printList(BinaryTreeToDLL.binaryTreeToDLL(simpleBinaryBT));
        simpleBinaryBT = BinaryTree.getSimpleBinaryBT();

        System.out.println("");
        System.out.println("ContructBT :");
        int [] inOrder = {20,10,40,30,50};
        System.out.println("the inOrder :"+ Arrays.toString(inOrder));
        int [] preOrder = {10,20,30,40,50};
        System.out.println("the preOrder :"+Arrays.toString(preOrder));
        System.out.println("the Constructed BT :");
        LevelOrderLineWise.levelOrderLineWise(ContructBT.constructBT(inOrder,preOrder,0,inOrder.length-1));

        System.out.println("");
        System.out.println("SpiralViewBasic of simpleBinaryBT: ");
        SpiralViewBasic.spiralView(simpleBinaryBT);

        System.out.println("");
        System.out.println("SpiralViewTwoStackMethod of simpleBinaryBT: ");
        SpiralViewTwoStackMethod.spiralView(simpleBinaryBT);

        System.out.println("");
        System.out.println("SpiralViewReverseMethod of simpleBinaryBT: ");
        SpiralViewReverseMethod.spiralView(simpleBinaryBT);

        System.out.println("");
        System.out.println("DiameterBT of simpleBinaryBT: " + DiameterBT.diameterBT(simpleBinaryBT));

        System.out.println("");
        System.out.println("LCA of (4,5) in simpleBinaryBT: " + LowestCommonAncestorBT.lCA(simpleBinaryBT,4,5).data);

        System.out.println("");
        System.out.println("LCA of (15,6) in simpleBinaryBT: " + LowestCommonAncestorBT.lCA(simpleBinaryBT,15,6).data);
    }
}
