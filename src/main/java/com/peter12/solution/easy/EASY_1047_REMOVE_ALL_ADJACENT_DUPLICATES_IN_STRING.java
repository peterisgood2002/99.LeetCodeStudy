package com.peter12.solution.easy;

import java.util.Stack;

public class EASY_1047_REMOVE_ALL_ADJACENT_DUPLICATES_IN_STRING {
public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for( char ch : s.toCharArray() ) {
            
            if( stack.isEmpty() ) {
                stack.push( ch );
            } else {
                if( stack.peek() == ch ) {
                    stack.pop();
                } else {
                    stack.push( ch );
                }
            }
                    
        }
        
        String result = "";
        while( !stack.isEmpty() ) {
            result = stack.pop() + result; 
        } 
            
        return result;
    }
}
