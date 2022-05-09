package edu.kis.vh.nursery.list;

/**
 * Class represents element in list
 */
public class Node {

    public final int value;
    public Node prev, next;

    /**
     *
     * @param i sets the value of node to i
     */
    public Node(int i) {
        value = i;
    }

}
