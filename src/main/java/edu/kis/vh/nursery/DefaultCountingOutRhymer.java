package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


	private static final int CAPACITY = 12;
	private static final int INITIAL = -1;
	private static final int IF_EMPTY=-1;

	private final int[] numbers = new int[CAPACITY];

	private int total = INITIAL;

	public static int getCAPACITY() {
		return CAPACITY;
	}

	public static int getINITIAL() {
		return INITIAL;
	}

	public static int getIfEmpty() {
		return IF_EMPTY;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == IF_EMPTY;
	}

	public boolean isFull() {
		return total == CAPACITY-1;
	}



	protected int peekaboo() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return IF_EMPTY;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}
	public int[] getNumbers() {
		return numbers;
	}
}
