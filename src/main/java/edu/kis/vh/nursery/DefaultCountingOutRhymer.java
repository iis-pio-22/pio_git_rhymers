package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TOTAL = -1;
	public static final int SIZE = 12;
	public static final int FULL = SIZE - 1;
	public static final int EMPTY = -1;

	private final int[] numbers = new int[SIZE];

	public int total = TOTAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL;
	}

	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY;
		return numbers[total--];
	}

}
