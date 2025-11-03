package com.dsa.practise.list;

public class CircularSinglyLinkedList {
	
	private ListNode last;
	private int lenght;
	
	private class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public CircularSinglyLinkedList() {
		last = null;
		lenght = 0;
	}
	
	public int length() {
		return lenght;
	}

}
