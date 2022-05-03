package com.dsa.binarytree;

import com.dsa.binarytree.convert.BinaryTreeToDLL;
import com.dsa.binarytree.convert.DeserializePerOrderApproach;
import com.dsa.binarytree.convert.SerializePreOrderApproach;
import com.dsa.binarytree.views.*;
import com.dsa.binarytree.properties.*;
import com.dsa.binarytree.traversals.*;
import com.dsa.binarytree.convert.ContructBT;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ashwini.s
 */
public class BTExecutor {
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
        ZigZagViewBasic.spiralView(simpleBinaryBT);

        System.out.println("");
        System.out.println("SpiralViewTwoStackMethod of simpleBinaryBT: ");
        ZigZagViewTwoStackMethod.spiralView(simpleBinaryBT);

        System.out.println("");
        System.out.println("SpiralViewReverseMethod of simpleBinaryBT: ");
        ZigZagViewReverseMethod.spiralView(simpleBinaryBT);

        System.out.println("");
        System.out.println("DiameterBT of simpleBinaryBT: " + DiameterBT.diameterBT(simpleBinaryBT));

        System.out.println("");
        System.out.println("LCA of (4,5) in simpleBinaryBT: " + LowestCommonAncestorBT.lCA(simpleBinaryBT,4,5).data);

        System.out.println("");
        System.out.println("LCA of (15,6) in simpleBinaryBT: " + LowestCommonAncestorBT.lCA(simpleBinaryBT,15,6).data);

        System.out.println("");
        System.out.println("CompleteBTNodeCount.naiveNodeCount of simpleBinaryBT: ");
        System.out.println(CompleteBTNodeCount.naiveNodeCount(simpleBinaryBT));

        System.out.println("");
        System.out.println("CompleteBTNodeCount.efficientNodeCount of simpleBinaryBT: ");
        System.out.println(CompleteBTNodeCount.efficientNodeCount(simpleBinaryBT));

        ArrayList<Integer> serializedArray = new ArrayList<>();
        System.out.println("");
        System.out.println("SerializePreOrderApproach of simpleBinaryBT: ");
        SerializePreOrderApproach.serialize(simpleBinaryBT,serializedArray);
        System.out.println(serializedArray.toString());

        System.out.println("");
        /*
                         10
                    20       30
                          40      50
                             60     70

         */
        int [] d_arr =  {10,20,-1,-1,30,40,-1,60,-1,-1,50,-1,70,-1,-1};
        System.out.println("calling deserialise for arr :" + Arrays.toString(d_arr));
        Node deserialisedRoot = DeserializePerOrderApproach.deserialize(d_arr);
        System.out.println(" Level Order Traversal of desrialized tree :");
        LevelOrderLineWise.levelOrderLineWise(deserialisedRoot);


    }
}
