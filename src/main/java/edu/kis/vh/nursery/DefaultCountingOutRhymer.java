package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int INDEX = -1;
	private static final int IS_EMPTY = -1;
	private static final int CAPACITY = 12;
	private int total = INDEX;
	private final int[] numbers = new int[CAPACITY];

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == INDEX;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return IS_EMPTY;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return IS_EMPTY;
		}
		return numbers[total--];
	}

}
