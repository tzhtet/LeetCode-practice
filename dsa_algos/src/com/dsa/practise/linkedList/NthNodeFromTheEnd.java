package com.dsa.practise.linkedList;

public class NthNodeFromTheEnd {

	private ListNode head;

	public static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " -----> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
	public ListNode getNthNodeFromEnd(int n) {
		if(head == null) {
			return null;
		}
		
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid value n = " + n);
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		
		int count = 0;
		
		while(count < n) {
			refPtr = refPtr.next;
		}
		return refPtr;
	}
	
	public static void main(String[] args) {
		
	}

}
