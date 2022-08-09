package com.dsa.stack;

public class StackExecutor {
    public static void main(String [] arr)
    {
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        System.out.println("isBalanced : " + balancedParanthesis.isBalanced("{{[[()]]()}}"));
    }
}
