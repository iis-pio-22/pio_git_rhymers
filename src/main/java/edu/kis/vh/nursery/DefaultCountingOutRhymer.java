package edu.kis.vh.nursery;

/**
 *
 */

public class DefaultCountingOutRhymer {
	/**
	 * @param in
	 */

	public static final int CAPACITY = 12;
	public static final int TOTAL = -1;
	public static final int FULL = 11;
	private final int[] NUMBERS = new int[CAPACITY];

	private int total = TOTAL;

	/**
	 * @return
	 */
	public int getTotal(){
		return total;
	}

	protected void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return
	 */
	protected boolean callCheck() {
		return total == TOTAL;
	}
	/**
	 * @return
	 */
	protected boolean isFull() {

		return total == FULL;
	}

	/**
	 * @return
	 */
	protected int peekaboo() {
		if (callCheck())
			return TOTAL;
		return NUMBERS[total];
	}

	/**
	 * @return
	 */
	protected int countOut() {
		if (callCheck())
			return TOTAL;
		return NUMBERS[total--];
	}

	public int[] getNUMBERS() {
		return NUMBERS;
	}

}
