package com.dsa.practise.linkedList;

public class ReverseSinglyLinkedList {
	
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "---> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String[] args) {
		
	}
	

}
