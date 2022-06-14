package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int CAPACITY = 12;
	public static final int INIT_INDEX = -1;
	private final int[] NUMBERS = new int[CAPACITY];

	public int total = INIT_INDEX;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == INIT_INDEX;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return INIT_INDEX;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return INIT_INDEX;
		return NUMBERS[total--];
	}

}
