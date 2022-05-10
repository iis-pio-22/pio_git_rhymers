package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int CAPACITY = 12;
	public static final int START_NUMBER = -1;
	public static final int CALL_CHECK_RETURN_VAL=-1;

	private final int[] numbers = new int[CAPACITY];

	public int total = START_NUMBER;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == CALL_CHECK_RETURN_VAL;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return -1;
		return numbers[total--];
	}

}
