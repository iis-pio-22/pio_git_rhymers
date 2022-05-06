package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private static final int INT = -1;
	private static final int SIZE = 12;
	private final int[] NUMBERS = new int[SIZE];
	private int total = INT;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
		NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == INT;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return INT;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return NUMBERS[total--];
	}

}
