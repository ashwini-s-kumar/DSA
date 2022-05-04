package com.dsa.binarytree.operations;

import com.dsa.binarytree.Node;
class Depth{
    int d;
    Depth(int x)
    {
        this.d = x;
    }
}
public class BurnBTFromLeaf {
    static int minTime = -1;
    public static int minBurnTime(Node root, int target)
    {
        Depth depth = new Depth(-1);
        BurnBTFromLeaf b = new BurnBTFromLeaf();
        b.burn(root,target,depth);
        return minTime;
    }
    // returns height of root
    public int burn(Node root,int target,Depth depth)
    {
        if(root == null)
            return 0;
        if(root.data == target)
        {
            depth.d = 1;
            return 1;//height
        }
        Depth rd = new Depth(-1);
        Depth ld = new Depth(-1);

        int lh = burn(root.left,target,ld);
        int rh = burn(root.right,target,rd);

        if(ld.d != -1)
        {
            minTime= Math.max(minTime,1+ld.d+rh);
            depth.d= ld.d+ 1;
        }
        if(rd.d != -1)
        {
            minTime= Math.max(minTime,1+ rd.d+lh);
            depth.d = rd.d+1;
        }
        return 1+Math.max(lh,rh);
    }
}
