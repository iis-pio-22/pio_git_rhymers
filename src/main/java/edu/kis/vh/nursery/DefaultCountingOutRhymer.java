package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int INITIALIZE_VALUE = -1;
    public static final int LIMIT = 12;
    private final int[] NUMBERS = new int[LIMIT];

    public int numbersCounter = INITIALIZE_VALUE;

    public void countIn(int number) {
        if (!isFull())
            NUMBERS[++numbersCounter] = number;
    }

    public boolean isEmpty() {

        return numbersCounter == -1;
    }

    public boolean isFull() {

        return numbersCounter == 11;
    }

    protected int peekaboo() {
        if (isEmpty())
            return -1;
        return NUMBERS[numbersCounter];
    }

    public int countOut() {
        if (isEmpty())
            return -1;
        return NUMBERS[numbersCounter--];
    }

}
