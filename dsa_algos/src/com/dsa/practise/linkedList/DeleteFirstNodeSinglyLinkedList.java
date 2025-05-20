package com.dsa.practise.linkedList;

public class DeleteFirstNodeSinglyLinkedList {
	
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " ----> ");
			 current = current.next;
		}
		System.out.println("null");
	}
	
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public static void main(String[] args) {
		DeleteFirstNodeSinglyLinkedList  deleteFirst = new DeleteFirstNodeSinglyLinkedList();
		deleteFirst.insertFirst(106);
		deleteFirst.insertFirst(306);
		deleteFirst.insertFirst(903);
		
		deleteFirst.display();
		
		System.out.println(deleteFirst.deleteFirst().data);
		System.out.println(deleteFirst.deleteFirst().data);

		deleteFirst.display();
	}

}
