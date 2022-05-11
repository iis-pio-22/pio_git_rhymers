package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int INITIAL = -1;
	public static final int DEFAULT_RETURN = -1;
	public static final int CAPACITY = 12;
	final private int[] numbers = new int[CAPACITY];

	private int total = INITIAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int getTotal() {
		return total;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_RETURN;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_RETURN;
		return numbers[total--];
	}

}
