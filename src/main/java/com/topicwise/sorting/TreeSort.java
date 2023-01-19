package com.topicwise.sorting;

public class TreeSort {
    public class Node
    {
        int data;
        Node left,  right;
        Node(int data)
        {
            this.data = data;
        }
    }
    Node root;

    public void insert(int data)
    {
        root = insertBST(root, data);
    }

    public Node insertBST(Node root, int data)
    {
        if(root == null)
        {
            Node newNode = new Node(data);
            return newNode;
        }

        if(data < root.data)
        {
            root.left = insertBST(root.left, data);
        }
        else{
            root.right = insertBST(root.right, data);
        }

        return root;
    }

    public void inorder(Node root)
    {
        if( root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }

    public void treeSort(int [] arr)
    {
        for(int i = 0 ; i < arr.length; i++)
        {
            insert(arr[i]);
        }
        inorder(root);
    }
}
