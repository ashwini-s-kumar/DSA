package com.topicwise.stack.medium;

import java.util.Stack;

public class EvaluatePostfix {
    public static int subRes(int op1, int op2, char operator){
        switch (operator){
            case '+':return op1 + op2;
            case '-':return op1 - op2;
            case '*':return op1 * op2;
            case '/':return op1 / op2;
            case '^':return op1 ^ op2;
        }
        return 1;
    }
    public static void evaluate(String str){
        Stack<Integer>  stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                stack.push(c - '0');
            }else{
                int op2 = stack.pop();
                int op1 = stack.pop();

                stack.push(subRes(op1, op2, c));
            }
        }
        System.out.println("The result : " + stack.peek());
    }

    public static void main(String [] arr){
        String postfix = "231*+9-";
        evaluate(postfix);
    }
}
