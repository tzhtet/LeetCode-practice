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
	
	private ListNode getNthNodeFromEnd(int n) {
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
			if(refPtr == null) {
				throw new IllegalArgumentException(n + " is greather than the number of nodes in list");
			}
			refPtr = refPtr.next;
			count++;
		}
		
		while(refPtr != null) {
			refPtr = refPtr.next;
			count++;
		}
		return mainPtr;
	}
	
	private void insertAtBeginning(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public static void main(String[] args) {
		NthNodeFromTheEnd nth = new NthNodeFromTheEnd();
		nth.insertAtBeginning(10);
		nth.insertAtBeginning(90);
		nth.insertAtBeginning(70);
		nth.insertAtBeginning(40);
		nth.insertAtBeginning(30);
		nth.insertAtBeginning(45);
		
		nth.display();
		
		ListNode result = nth.getNthNodeFromEnd(2);
		System.out.println("Nth node from end is - " + result.data);
	}

}
