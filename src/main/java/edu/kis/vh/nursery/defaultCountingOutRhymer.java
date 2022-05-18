package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int EMPTY_ARRAY = -1;
	private int total = -1;
	public int getTotal() {
		return total;
	}

	final private int[] numbers = new int[ARRAY_SIZE];

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_ARRAY;
	}

	public boolean isFull() {
		return total == ARRAY_SIZE-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_ARRAY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_ARRAY;
		return numbers[total--];
	}

}
