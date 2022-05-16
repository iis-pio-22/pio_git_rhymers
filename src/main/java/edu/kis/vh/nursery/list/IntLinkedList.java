package edu.kis.vh.nursery.list;

public class IntLinkedList {


	private static class Node {

		private final int value;
		protected Node prev, next;

		public Node(int i) {
			value = i;
		}
		public int getValue() {
			return this.value;
		}
	}

	Node last;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.prev;
		return ret;
	}

}

// klasa node została usunięta i została klasą wewnętrzną by mogła być prywatna