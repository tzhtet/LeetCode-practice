package com.dsa.practise.linkedList;

public class InsertNodeInSorted {

	private ListNode head;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private void display() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " ------> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}

	private void insertAtBeginning(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	private ListNode insertInSortedList(int value) {
	    ListNode newNode = new ListNode(value);

	    if (head == null || head.data >= newNode.data) {
	        newNode.next = head;
	        head = newNode;
	        return head;
	    }

	    ListNode current = head;
	    while (current.next != null && current.next.data < newNode.data) {
	        current = current.next;
	    }

	    newNode.next = current.next;
	    current.next = newNode;
	    return head;
	}

	
	public static void main(String[] args) {
		InsertNodeInSorted inn = new InsertNodeInSorted();
		inn.insertAtBeginning(30);
		inn.insertAtBeginning(40);
		inn.insertAtBeginning(60);
		inn.insertAtBeginning(50);
		inn.insertAtBeginning(90);
		inn.display();
		inn.insertInSortedList(11);
		inn.display();

		
	}

}
