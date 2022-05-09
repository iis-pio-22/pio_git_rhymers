package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int static_total = -1;
    public static final int size_numbers = 12;
    public static final int default_value=-1;
    private final int[] numbers = new int[size_numbers];

    public int total = static_total;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == static_total;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return default_value;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return default_value;
        return numbers[total--];
    }

}
