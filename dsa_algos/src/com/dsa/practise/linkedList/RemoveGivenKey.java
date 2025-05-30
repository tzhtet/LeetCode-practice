package com.dsa.practise.linkedList;

public class RemoveGivenKey {

	private ListNode head;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private void insertAtBeginning(int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void printLinkedList() {
		if(head == null) {
			System.out.println("null");
		}
		ListNode current = head;
		while(null != current) {
			System.out.print(current.data + " ----> ");
			current = current.next;
		}
		System.out.println("null");
	}

}
