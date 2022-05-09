package edu.kis.vh.nursery.list;

/**
 * Class represents element in list
 */
public class Node {

    private final int value;
    private Node prev, next;

    /**
     *
     * @param i sets the value of node to i
     */
    public Node(int i) {
        value = i;
    }

    /**
     *
     * @return node value
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @return reference to previous node
     */
    public Node getPrev() {
        return prev;
    }

    /**
     *
     * @param prev sets previous node to prev
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *
     * @return reference to next element
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @param next sets next node to next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
