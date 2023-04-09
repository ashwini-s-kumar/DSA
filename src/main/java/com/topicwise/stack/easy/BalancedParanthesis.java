package com.topicwise.stack.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

    public Boolean isBalanced(String str)
    {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < str.length(); i++)
        {
            char x = str.charAt(i);
            if(x == '{' || x == '[' || x == '(')
            {
                stack.add(x);
                continue;
            }
            if(stack.isEmpty())
                return false;

            char stackCurrent = stack.pop();
            switch (x)
            {
                case '}':
                    if(stackCurrent == ']' || stackCurrent == ')')
                        return false;

                case ']':
                    if(stackCurrent == '}' || stackCurrent == ')')
                        return false;

                case ')':
                    if(stackCurrent == '}' || stackCurrent == ']')
                        return false;
            }
        }
        return stack.isEmpty();
    }
}
