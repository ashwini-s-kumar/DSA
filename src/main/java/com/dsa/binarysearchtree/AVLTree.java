package com.dsa.binarysearchtree;

import com.dsa.binarytree.Node;
import com.dsa.binarytree.properties.HeightBt;
import com.dsa.binarytree.traversals.PreOrder;

public class AVLTree {
    String s ="{\"bool\":{\"must\":[],\"filter\":[{\"match_all\":{}},{\"exists\":{\"field\":\"http_method\"}},{\"exists\":{\"field\":\"http_status_code\"}},{\"exists\":{\"field\":\"http_url\"}},{\"exists\":{\"field\":\"request_time\"}},{\"exists\":{\"field\":\"kubernetes_pod_name\"}},{\"exists\":{\"field\":\"kubernetes_namespace\"}},{\"range\":{\"startTimeMillis\":{\"gte\":\"2022-06-03T12:28:48.905Z\",\"lte\":\"2022-06-03T12:43:48.905Z\",\"format\":\"strict_date_optional_time\"}}}],\"should\":[],\"must_not\":[{\"match_phrase\":{\"http_url\":\"*/metrics\"}}]}}";
            Node root;
    Node rightRotate(Node y)
    {
        Node x = y.left;
        Node t2= x.right;

        x.right = y;
        y.left = t2;

        x.height = 1+Math.max(HeightBt.heightBt(x.right),HeightBt.heightBt(x.left));
        y.height = 1+Math.max(HeightBt.heightBt(y.right),HeightBt.heightBt(y.right));

        return x;
    }
    Node leftRotate(Node x)
    {
        Node y = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = 1+Math.max(HeightBt.heightBt(x.right),HeightBt.heightBt(x.left));
        y.height = 1+Math.max(HeightBt.heightBt(y.right),HeightBt.heightBt(y.right));

        return y;
    }

    int getBalanced(Node n)
    {
        if(n == null )return 0;
        return HeightBt.heightBt(n.left) - HeightBt.heightBt(n.right);
    }
    Node insertAVL(Node root,int key)
    {
        if(root == null)
            return new Node(key);
        else if(key < root.data)
            root.left = insertAVL(root.left,key);
        else if(key > root.data)
            root.right = insertAVL(root.right,key);
        else
            return root;

        root.height = 1+Math.max(HeightBt.heightBt(root.left),HeightBt.heightBt(root.right));
        int balanced = getBalanced(root);
        //Right - right
        if(balanced < -1 && key > root.right.data)
            return leftRotate(root);
        //Right - left
        if(balanced < -1 && key < root.right.data )
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        //Left - left
        if(balanced > 1 && key < root.left.data)
            return rightRotate(root);
        //Left - right
        if(balanced > 1 && key > root.left.data)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        return  root;
    }
    Node getSuccessor(Node node)
    {
        // closest higher value
        Node cur = node.right;
        while(cur.left != null)
            cur = cur.left;
        return cur;
    }
    /*Node deleteAVL(Node root, int key)
    {
        if(root == null)
            return null;
        else if(key < root.data)
            root.left = deleteAVL(root.left,key);
        else if(key > root.data)
            root.right = deleteAVL(root.right,key);
        // key == root.data
        else
        {
            if(root.right == null && root.left == null)//no children
                return null;
            if(root.right == null)// no right child
                return root.left;
            if(root.left == null)
                return root.right;
            else // have both child
            {
                Node successor = getSuccessor(root);
                root.data = successor.data;
                root.right = deleteAVL(root.right,successor.data);
            }
        }

        root.height = 1+Math.max(HeightBt.heightBt(root.left),HeightBt.heightBt(root.right));
        int balanced = getBalanced(root);



    }*/
    public static void main(String [] arr)
    {
        AVLTree tree = new AVLTree();
        tree.root = tree.insertAVL(tree.root,10);
        tree.root = tree.insertAVL(tree.root, 20);
        tree.root = tree.insertAVL(tree.root,30);
        tree.root = tree.insertAVL(tree.root, 40);
        tree.root = tree.insertAVL(tree.root,50);
        tree.root = tree.insertAVL(tree.root, 25);

        /*
                 30
             20       40
          10   25        50
         */
        System.out.println("The pre-Order traversal of AVL tree : ");
        PreOrder.preOrder(tree.root);
    }
}
