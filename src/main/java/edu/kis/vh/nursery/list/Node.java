package edu.kis.vh.nursery.list;

public class Node {

	private final int value;
	private Node prev;
	private Node next;

	/**
	 * Constructor assigning 'value' to 'i'.
	 * @param i
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * Returns previous Node.
	 * @return previous Node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Sets the previous Node to the argument passed to the method.
	 * @param prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * Gets the next Node.
	 * @return the next Node.
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Sets the next Node to the argument passed to the method.
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Getter that returns 'value'.
	 * @return value
	 */
	public int getValue() {
		return value;
	}
}
