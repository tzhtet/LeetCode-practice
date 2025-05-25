package com.dsa.practise.linkedList;

public class FindMiddleNode {
	
	private ListNode head;
	
	public static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " -----> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public void insertAtBeginning(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;	
	}
	
	public ListNode getMiddleNode() {
		if(head == null) {
			return null;
		}
		
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr;
	}
	
	public static void main(String[] args) {
		FindMiddleNode find = new FindMiddleNode();
		find.insertAtBeginning(11);
		find.insertAtBeginning(30);
		find.insertAtBeginning(8);
		find.insertAtBeginning(90);
		find.display();
		
		ListNode middleNode = find.getMiddleNode();
		System.out.println("Middle node is -- " + middleNode.data);
	}

}
