package com.dsa.practise.linkedList;

public class SinglyLinkedList {

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
		while (current != null) {
			System.out.print(current.data + "---> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count ++;
			current = current.next;
		}
		return count;
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void insert(int position, int value){
		// 1 -> 4 -> 5
		// 1 -> 6 -> 4 -> 5
		ListNode node = new ListNode(value);
		
		if(position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous = previous.next;
				count ++;
			}
			
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
		
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
	//	sll.head = new ListNode(10);
   //	ListNode second = new ListNode(1);
  //	ListNode third = new ListNode(8);
 //	    ListNode fourth = new ListNode(11);

//		sll.head.next = second;
//		second.next = third;
//		third.next = fourth;
//		
//		sll.insertFirst(11);
//		sll.insertFirst(8);
//		sll.insertFirst(1);
//		sll.display();
		
		
		sll.insert(1, 3);
		sll.insert(2, 5);
		sll.insert(1, 2);
		sll.display();
		
		//System.out.println("Length is - " + sll.length());
	}

}
