package edu.kis.vh.nursery.list;

/**
 * @author Arkinefed
 *
 */
public class Node {


	private final int value;
	private Node prev;
	private Node next;


	/**
	 * @param i - wartość, która ma być przechowywana przez węzeł
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * @return wartość przechowywaną przez węzeł
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return poprzedni węzeł
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * @param prev - węzeł, który ma być ustawiony, jako poprzedni
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * @return nastęny węzeł
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next - węzeł, który ma być ustawiony, jako następny
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
}
