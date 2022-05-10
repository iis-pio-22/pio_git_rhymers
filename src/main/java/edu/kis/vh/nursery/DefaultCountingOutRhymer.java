package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int CAPACITY = 12;
	public static final int EMPTY_RHYMER_INDICATOR = -1;
	public static final int MAX_SIZE = 11;
	private final int[] numbers = new int[CAPACITY];

	public int total = EMPTY_RHYMER_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == EMPTY_RHYMER_INDICATOR;
	}

	public boolean isFull() {
		return total == MAX_SIZE;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_RHYMER_INDICATOR;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_RHYMER_INDICATOR;
		return numbers[total--];
	}

}
