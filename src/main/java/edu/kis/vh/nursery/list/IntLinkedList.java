package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int value;

    /**
     * use it to add element to list
     * @param value - the value that will be added
     */
    public void push(int value) {
        if (last == null) last = new Node(value);
        else {
            last.setNext(new Node(value));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     *
     * @return true when list is empty
     */
    public boolean isEmpty() {

        return last == null;
    }

    /**
     *
     * @return always false beacuse this implemention has no limit
     */
    public boolean isFull() {

        return false;
    }

    /**
     * you get get value from top of list
     * @return value or -1 on error
     */
    public int top() {
        if (isEmpty()) return -1;
        return last.getValue();
    }

    /**
     * delate last added element
     * set prev as new top node
     * @return value of last element
     */
    public int pop() {
        if (isEmpty()) return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
