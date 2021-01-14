package com.peter12.solution.data;

public class ListNodeData {
	public static ListNode testData1() {
		ListNode result = new ListNode(3);
		
		ListNode current = result;
		current.next = new ListNode(2);
		current = current.next;
		ListNode circle = current;
		
		current.next = new ListNode(0);
		current = current.next;
		
		current.next = new ListNode(-4);
		current = current.next;
		
		current.next = circle;
		
		
		return result;
	}
	
	public static ListNode testData2() {
		ListNode result = new ListNode(1);
		
		ListNode current = result;
		current.next = new ListNode(2);
		current = current.next;
		
		current.next = result;
		
		
		return result;
	}
	
	
}
