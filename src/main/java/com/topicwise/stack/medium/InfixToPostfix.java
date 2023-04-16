package com.topicwise.stack.medium;

import java.util.Stack;

public class InfixToPostfix {

    private static Stack<Character> stack = new Stack<>();

    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String convert(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                res += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    res += stack.pop();
                }
                // pop '('
                stack.pop();
            } else {
                // c is operand
                while(!stack.isEmpty() &&
                        precedence(c) <= precedence(stack.peek())) {
                    res += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid expression";
            }
            res += stack.pop();
        }

        return res;
    }

    public static void main(String[] args)
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        //String exp = "a+(b*c)";

        System.out.println(convert(exp));
    }

}