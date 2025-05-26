package com.dsa.practise.linkedList;

public class RemoveDuplicate {
	
	private ListNode head;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private void  insertAtBeginning(int data) {
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
	
	public void removeDuplicate() {
		if(head == null) {
			return;
		}
		
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data ) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		RemoveDuplicate rm = new RemoveDuplicate();
		rm.insertAtBeginning(4);
		rm.insertAtBeginning(4);
		rm.insertAtBeginning(1);
		rm.insertAtBeginning(9);
		rm.insertAtBeginning(9);
		
		rm.printLinkedList();
		rm.removeDuplicate();
		rm.printLinkedList();
	}
	
	

}
