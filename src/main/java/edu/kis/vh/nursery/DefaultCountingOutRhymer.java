package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INITIAL_RHYMER_INDICATOR = 1;
	public static final int MAX_SIZE = 12;
	public static final int IF_EMPTY = 11;
	private final int[] numbers = new int[MAX_SIZE];

	public int total = -INITIAL_RHYMER_INDICATOR;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == -INITIAL_RHYMER_INDICATOR;
		}

	public boolean isFull() {
		return total == IF_EMPTY;
	}

	protected int peekaboo() {
		if (callCheck())
			return -INITIAL_RHYMER_INDICATOR;
		return numbers[total];
	}
				
	public int countOut() {
		if (callCheck())
			return -INITIAL_RHYMER_INDICATOR;
		return numbers[total--];
	}
}
