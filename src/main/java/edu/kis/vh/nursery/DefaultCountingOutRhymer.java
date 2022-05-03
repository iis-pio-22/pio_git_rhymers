package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int EMPTY_VALUE = -1;
	private static final int NUMBERS_MAX_SIZE = 12;
	private static final int EMPTY_POSITION = -1;
	private static final int FULL_POSITION = NUMBERS_MAX_SIZE - 1;

	private final int[] numbers = new int[NUMBERS_MAX_SIZE];

	private int total = EMPTY_POSITION;

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

	public int getTotal() {
		return total;
	}

//	kombinacja klawiszy alt + ← oraz alt + →
//	powoduje przejście pomiędzy plikami z kodem programu
}
