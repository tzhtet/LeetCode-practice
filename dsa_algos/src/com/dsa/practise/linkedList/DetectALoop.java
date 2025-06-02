package com.dsa.practise.linkedList;

public class DetectALoop {

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
			System.out.print(current.data + " ------> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public boolean containsLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	public void createALoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	
	public static void main(String[] args) {
		DetectALoop det = new DetectALoop();
		det.createALoopInLinkedList();
		System.out.println(det.containsLoop());
	}
	
		
}
