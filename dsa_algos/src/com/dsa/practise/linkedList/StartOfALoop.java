package com.dsa.practise.linkedList;

public class StartOfALoop {

	private ListNode head;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	private ListNode startNodeInLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(fastPtr == slowPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}
	
	private ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		
		while(temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}
	
	private boolean containsLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		
		if(fastPtr == slowPtr) {
			return true;
		}
		return false;
	}

	private void createALoopLinkedList() {
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
		StartOfALoop start = new StartOfALoop();
		start.createALoopLinkedList();
		System.out.println(start.containsLoop());
		System.out.println(start.startNodeInLoop().data);
	}

}
