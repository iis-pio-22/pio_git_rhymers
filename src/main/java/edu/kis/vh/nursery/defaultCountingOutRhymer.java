package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];

    public int numbersCounter = -1;

    public void countIn(int number) {
        if (!isFull())
            NUMBERS[++numbersCounter] = number;
    }

    public boolean callCheck() {
        return numbersCounter == -1;
    }

    public boolean isFull() {
        return numbersCounter == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[numbersCounter];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[numbersCounter--];
    }

}
