package com.dsa.practise.linkedList;

public class SearchSinglyLinkedList {

	private static ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private static boolean find(ListNode head, int searchKey) {
		if(head == null) {
			return false;
		}
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	private void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	private void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " ---> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		SearchSinglyLinkedList search = new SearchSinglyLinkedList();
		search.insertFirst(60);
		search.insertFirst(30);
		search.insertFirst(90);
		search.insertFirst(40);
		search.insertFirst(50);
		search.insertFirst(101);
		search.display();
		
		try {
			if(search.find(head, 101)) {
				System.out.println("Search Key found !!!");
			}else {
				System.out.println("Search Key not found !!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
