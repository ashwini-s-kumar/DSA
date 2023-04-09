package com.topicwise.binarysearchtree;
/**
 *
 * @author ashwini.s
 */
import com.topicwise.binarysearchtree.easy.operations.DeleteNodeFromBST;
import com.topicwise.binarysearchtree.easy.operations.InsertIntoBST;
import com.topicwise.binarysearchtree.easy.operations.SearchBST;
import com.topicwise.binarysearchtree.easy.properties.BSTCeil;
import com.topicwise.binarysearchtree.easy.properties.BSTFloor;
import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.easy.traversals.LevelOrderLineWise;

public class BSTExecutor {
    public static void main(String [] arr)
    {
        Node simpleBST = BinarySearchTree.getSimpleBST();

        System.out.println("");
        System.out.println("LevelOrderLineWise of simpleBST : ");
        LevelOrderLineWise.levelOrderLineWise(simpleBST);

        System.out.println("");
        System.out.println("Search 60 in simpleBST : " + SearchBST.searchBST(simpleBST,60));

        System.out.println("");
        System.out.println("Search 90 in simpleBST : " + SearchBST.searchBST(simpleBST,90));

        System.out.println("");
        System.out.println("Insert 25  into simpleBST : " );
        InsertIntoBST.insertIntoBST(simpleBST , 25);
        LevelOrderLineWise.levelOrderLineWise(simpleBST);

        simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println("");
        System.out.println("delete 60  into simpleBST : " );
        DeleteNodeFromBST.deleteNodeFromBST(simpleBST , 60);
        LevelOrderLineWise.levelOrderLineWise(simpleBST);

        simpleBST = BinarySearchTree.getSimpleBST();
        System.out.println("");
        System.out.println("floor of  44  in simpleBST : " + BSTFloor.floor(simpleBST,44).data );

        System.out.println("");
        System.out.println("ceil of  44  in simpleBST : " + BSTCeil.ceil(simpleBST,44).data );
    }
}
