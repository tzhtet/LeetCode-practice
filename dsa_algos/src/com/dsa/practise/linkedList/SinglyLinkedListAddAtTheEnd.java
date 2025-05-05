package com.dsa.practise.linkedList;

public class SinglyLinkedListAddAtTheEnd {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void display() {
		ListNode current = head;
		if(current != null) {
			System.out.print(current.data + "----->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
	}

}
