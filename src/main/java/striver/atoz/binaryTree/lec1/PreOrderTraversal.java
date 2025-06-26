package striver.atoz.binaryTree.lec1;

import com.topicwise.binarytree.easy.traversals.InOrder;
import striver.atoz.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {
    public static void main(String [] arr) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        preOrderTraversal(root);
    }

    private static void preOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

}
