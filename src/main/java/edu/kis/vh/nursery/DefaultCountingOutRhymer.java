package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY  = -1;
    private static final int IS_EMPTY  = -1;
    private static final int CAPACITY = 12;

    private final int[] numbers = new int[CAPACITY];


    public int total = EMPTY ;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total--];
    }

}
