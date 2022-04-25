package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NONE = -1;
    public static final int FULL = 12;

    private final int[] numbers = new int[FULL];


    public int total = NONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NONE;
    }

    public boolean isFull() {
        return total == FULL - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NONE;
        return numbers[total--];
    }

}
