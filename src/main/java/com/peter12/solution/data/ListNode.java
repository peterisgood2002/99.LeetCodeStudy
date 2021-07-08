package com.peter12.solution.data;

public class ListNode {

	public int val;
	public ListNode next;
	public ListNode random;
	public ListNode() {}
	public ListNode(int val) { this.val = val; }
	public ListNode(int val, ListNode next) { this.val = val; this.next = next; }


	public static ListNode getLinkList(int[] data) {
		ListNode result = null;

		if( data == null ) {
			return result;
		}

		for( int i = data.length - 1; i >= 0; i-- ) {
			ListNode pre = new ListNode(data[i], result);

			result = pre;

		}

		return result;
	}

	public static boolean theSameList(ListNode l1, ListNode l2) {
		int size1 = getListSize(l1);
		int size2 = getListSize(l2);

		if( size1 != size2 ) {
			return false;
		} else {

			ListNode point1 = l1;
			ListNode point2 = l2;
			while ( point1 != null ) {
				if( point1.val != point2.val ) {
					return false;
				} else {
					point1 = point1.next;
					point2 = point2.next;
				}
			}

			return true;
		}

	}

	public static int getListSize(ListNode data) {
		int result = 0;

		while ( data != null ) {
			result++;

			data = data.next;
		}

		return result;
	}
	
	@Override
	public String toString() {

		String result = "[val=" + val + "] ->";
		if( next == null) {
			return result + "NULL";
		}

		return result + next.toString();
	}
}
