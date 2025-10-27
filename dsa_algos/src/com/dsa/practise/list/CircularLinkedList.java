package com.dsa.practise.list;

public class CircularLinkedList {

	private ListNode last;
	private int length;
	
	public class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public CircularLinkedList() {
		last = null;
		length = 0;
	}
	
	public int lenght() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void display() {
		if(last == null) {
			return;
		}
		ListNode first = last.next;
		while(first != last) {
			System.out.print(first.data + "----> ");
			first = first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertFirst(int data) {
		ListNode temp = new ListNode(data);
		if(temp != null) {
			
		}
	}
}
