package edu.kis.vh.nursery.list;

public class Node {

	public final int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

	public int top(IntLinkedList intLinkedList) {
		if (intLinkedList.isEmpty())
			return -1;
		return value;
	}
}
