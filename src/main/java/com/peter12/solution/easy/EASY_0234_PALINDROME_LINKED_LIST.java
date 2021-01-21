package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0234_PALINDROME_LINKED_LIST {
	public static boolean isPalindrome(ListNode head) {
		if( head == null ) {
			return true;
		}
		
		if( head.next == null ) {
			return true;
		}
		
		
		/**
		 * Solution: https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
		 * 1. Find the middle of the link list
		 * 
		 */
		int size = ListNode.getListSize(head);
		ListNode preMiddle = null;
		ListNode middle = head;
		for( int i = 0; i < size / 2; i++ ) {
			preMiddle = middle;
			middle = middle.next;
		}
		
		/*
		 * 2. Get the first second list that is reverted
		 * */
		
		ListNode secondList = null;
		if( size % 2 == 0 ) {
			secondList = EASY_0206_REVERSE_LINKED_LIST.reverseList(middle);
		} else {
			secondList = EASY_0206_REVERSE_LINKED_LIST.reverseList(middle.next);
		}
		 
		
		/*
		 * 3. Compare the first list and second list
		 * */
		ListNode firstCurrent = head;
		ListNode secondCurrent = secondList;
		boolean result = true;
		while(  secondCurrent != null ) {
			if( firstCurrent.val != secondCurrent.val ) {
				result = false;
				break;
			}
			
			firstCurrent = firstCurrent.next;
			secondCurrent = secondCurrent.next;
			
		}
		
		/* 4. Revert second List*/
		if( size % 2 == 0 ) {
			preMiddle.next = EASY_0206_REVERSE_LINKED_LIST.reverseList(secondList);
		} else {
			middle.next = EASY_0206_REVERSE_LINKED_LIST.reverseList(secondList);
		}
		
		
		return result;
		

	}
	
	
}
