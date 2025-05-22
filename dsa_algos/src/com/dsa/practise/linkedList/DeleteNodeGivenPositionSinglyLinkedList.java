package com.dsa.practise.linkedList;

public class DeleteNodeGivenPositionSinglyLinkedList {
	
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
		while(current != null) {
			System.out.print(current.data + " -----> ");
			current = current.next;
		}
		System.out.println();
	}
	
	private void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void delete(int position) {
		if(position == 1) {
			head = head.next;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
		
	}
	public static void main(String[] args) {
		DeleteNodeGivenPositionSinglyLinkedList del = new DeleteNodeGivenPositionSinglyLinkedList();
		del.insertLast(30);
		del.insertLast(90);
		del.insertLast(50);
		del.insertLast(70);
		del.display();
		del.delete(2);
		del.display();
		
	}

}
