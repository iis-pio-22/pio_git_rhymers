package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];

    public int numbersCounter = -1;

    public void countIn(int number) {
        if (!isFull())
            NUMBERS[++numbersCounter] = number;
    }

<<<<<<< b0546aead947bf5b9672d72e3204c49645ae42b3
    public boolean callCheck() {
        return numbersCounter == -1;
=======
    public boolean isEmpty() {
        return total == -1;
>>>>>>> changed methods names
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
