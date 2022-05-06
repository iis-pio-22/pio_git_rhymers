package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
  
	private static final int EMPTY = -1;
	private static final int DEFAULT_VALUE = -1;
	private static final int CAPACITY = 12;
	private final int[] numbers = new int[CAPACITY];

	private int total = EMPTY;
  
  public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == DEFAULT_VALUE;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return DEFAULT_VALUE;
		return numbers[total--];
	}

}
