package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int EMPTY_VALUE = -5;
	private static final int NUMBERS_SIZE = 12;
	private static final int EMPTY_POSITION = -1;
	private static final int FULL_POSITION = NUMBERS_SIZE - 1;


	private int[] numbers = new int[NUMBERS_SIZE];

	public int total = EMPTY_POSITION;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_POSITION;
	}

	public boolean isFull() {
		return total == FULL_POSITION;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		return numbers[total--];
	}

//	kombinacja klawiszy alt + ← oraz alt + →
//	powoduje przejście pomiędzy plikami z kodem programu
}
