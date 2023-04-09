package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ClockWiseView {
    public static void clockWiseView(Node root)
    {
        ArrayList<ArrayList<Integer>> bTArray = convertBTToArrayList(root);
        if(bTArray.isEmpty())
            return;
        int low=0,high = bTArray.size()-1;
        while(low  <= high)
        {
            if(low == high) {
                if (bTArray.size() % 2 == 0) {
                    printRightToLeft(bTArray.get(low));
                    break;
                }
                else{
                    printLeftToRight(bTArray.get(low));
                    break;
                }
            }
            printLeftToRight(bTArray.get(low));
            low+=1;
            System.out.println(" ");
            printRightToLeft(bTArray.get(high));
            high-=1;
            System.out.println(" ");
        }
    }
    static ArrayList<ArrayList<Integer>> convertBTToArrayList(Node root)
    {
        if(root == null)
            return new ArrayList<>();
        ArrayList<ArrayList<Integer>> binaryTree = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            ArrayList<Integer> row = new ArrayList<>();
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node cur = q.poll();
                row.add(cur.data);
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
            binaryTree.add(row);
        }
        return binaryTree;
    }
    static void printRightToLeft(ArrayList<Integer> arr)
    {
        for(int i=arr.size()-1;i>=0;i--)
            System.out.print(arr.get(i) +" ");
    }
    static void printLeftToRight(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
    }
}
