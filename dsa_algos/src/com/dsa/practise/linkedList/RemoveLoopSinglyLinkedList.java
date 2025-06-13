package com.dsa.practise.linkedList;

public class RemoveLoopSinglyLinkedList {
	
	private ListNode head;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = next;
		}
	}
	
	private void display() {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data + " -------> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}
	
	private ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		while(temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}
	private void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while(temp.next != slowPtr.next) {
			temp = temp.next;
			slowPtr = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}
	
	private void createALoopInLinkedList() {
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
		RemoveLoopSinglyLinkedList rm = new RemoveLoopSinglyLinkedList();
		rm.createALoopInLinkedList();
		
	}
}
