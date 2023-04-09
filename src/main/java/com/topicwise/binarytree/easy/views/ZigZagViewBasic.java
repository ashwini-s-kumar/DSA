package com.topicwise.binarytree.easy.views;

import com.topicwise.binarytree.Node;
import com.topicwise.binarytree.easy.properties.HeightBt;

/**
 *
 * @author ashwini.s
 */
public class ZigZagViewBasic {
    public static void spiralView(Node root)
    {
        boolean ltr = true;
        for(int level =1 ;level <= HeightBt.heightBt(root) ; level++)
        {
            printGivenLevel(root,level,ltr);
            System.out.println(" ");
            ltr=!ltr;
        }
    }
    static void printGivenLevel(Node root, int level, boolean ltr)
    {
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.data +" ");
        else if(level > 1)
        {
            if(ltr)
            {
                printGivenLevel(root.left,level-1,ltr);
                printGivenLevel(root.right,level-1,ltr);
            }
            if(!ltr)
            {
                printGivenLevel(root.right,level-1,ltr);
                printGivenLevel(root.left,level-1,ltr);
            }
        }
    }
}
