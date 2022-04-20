package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int FULL_NUMBERS_ARRAY = 11;

	private static final int EMPTY_NUMBERS_ARRAY = -1;

	private static final int NUMBERS_COUNT = 12;

	private int[] numbers = new int[NUMBERS_COUNT];

	public int total = EMPTY_NUMBERS_ARRAY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_NUMBERS_ARRAY;
	}

	public boolean isFull() {
		return total == FULL_NUMBERS_ARRAY;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_NUMBERS_ARRAY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_NUMBERS_ARRAY;
		return numbers[total--];
	}

}
