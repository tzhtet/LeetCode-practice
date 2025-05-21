package com.dsa.practise.linkedList;

public class DeleteLastNodeSinglyLinikedList {
	
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
	    if (head == null) {
	        head = newNode;
	        return;
	    }

	    ListNode current = head;
	    while (current.next != null) {
	        current = current.next;
	    }
	    current.next = newNode;
	}

	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " ----> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public ListNode deleteLast() {
		if(head ==  null || head.next == null ) {
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public static void main(String[] args) {
		DeleteLastNodeSinglyLinikedList sll = new DeleteLastNodeSinglyLinikedList();
		sll.insertLast(11);
		sll.insertLast(8);
		sll.insertLast(1);
		sll.insertLast(10);
		sll.display();
		
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);

		sll.display();
		
	}
	
	

}
