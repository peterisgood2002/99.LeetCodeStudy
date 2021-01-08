package com.peter12.solution.data;

public class ListNode {
	
	public int val;
	public ListNode next;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	@Override
	public String toString() {
		
		String result = "[val=" + val + "] ->";
		if( next == null) {
			return result + "NULL";
		}
		
		return result + next.toString();
	}
}
