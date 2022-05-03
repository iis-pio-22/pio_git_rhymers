package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY_LIST = -1;
	private static final Node LIST_END = null;
	Node last;
	int i;

	public void push(int i) {
		if (last == LIST_END)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == LIST_END;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_LIST;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_LIST;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
