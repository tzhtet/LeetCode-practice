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
	
	private void printLinkedList() {
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
	
	
	private void deleteNode(int key) {
		ListNode current = head;
		ListNode temp = null;
		
		if(current != null && current.data == key) {
			head = current.next;
			return;
		}
		
		while(current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		
		if(current == null) {
			return ;
		}
		
		temp.next = current.next;
	}
	
	
	
	public static void main(String[] args) {
		RemoveGivenKey remove = new RemoveGivenKey();
		remove.insertAtBeginning(15);
		remove.insertAtBeginning(10);
		remove.insertAtBeginning(8);
		remove.insertAtBeginning(7);
		remove.insertAtBeginning(4);
		remove.insertAtBeginning(3);
		remove.printLinkedList();
		
		remove.deleteNode(8);
		remove.printLinkedList();
	}

}
