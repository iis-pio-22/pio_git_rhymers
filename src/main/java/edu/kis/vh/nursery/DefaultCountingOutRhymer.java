package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int[] INTS = new int[12];
	public static final int INT = -1;

	private int[] numbers = INTS;

	public int total = INT;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
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
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return INT;
		return numbers[total--];
	}

//	kombinacja klawiszy alt + ← oraz alt + →
//	powoduje przejście pomiędzy plikami z kodem programu
}
