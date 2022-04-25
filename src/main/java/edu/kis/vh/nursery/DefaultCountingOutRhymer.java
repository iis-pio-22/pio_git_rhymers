package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int INDEX = -1;
	public static final int CAPACITY = 11;
	public int total = INDEX;
	private final int[] numbers = new int[12];

	public void countIn(int in) {
		if (!isFull()) {
			numbers[++total] = in;
		}
	}

	public boolean callCheck() {
		return total == INDEX;
	}

	public boolean isFull() {
		return total == CAPACITY;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return INDEX;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return INDEX;
		}
		return numbers[total--];
	}

}
