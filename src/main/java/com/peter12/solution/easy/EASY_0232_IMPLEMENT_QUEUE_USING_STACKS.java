package com.peter12.solution.easy;

import java.util.Stack;

public class EASY_0232_IMPLEMENT_QUEUE_USING_STACKS {
	
	Stack<Integer> data = null;
	Stack<Integer> operation = null;
	 /** Initialize your data structure here. */
    public EASY_0232_IMPLEMENT_QUEUE_USING_STACKS() {
    	data = new Stack<Integer>();
    	operation = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        data.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	while( !data.isEmpty()) {
        	
        	operation.push( data.pop());
        }
    	
    	int result = operation.pop();
    	
    	while( !operation.isEmpty() ) {
    		data.push( operation.pop());
    	}
    	
    	return result;
    }
    
    /** Get the front element. */
    public int peek() {
    	int result = 0;
        while( !data.isEmpty()) {
        	result = data.pop();
        	
        	operation.push(result);
        }
        
        while( !operation.isEmpty() ) {
        	data.push( operation.pop() );
        }
        
        return result;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return data.isEmpty();
    }
}
