package com.dsa.practise.linkedList;

public class RemoveLoopSinglyLinkedList {
	
	private ListNode head;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode() {
			this.data = data;
			this.next = next;
		}
	}
	
	private void display() {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data + " -------> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}
}
