package edu.kis.vh.nursery;

/**
 *
 */

public class DefaultCountingOutRhymer {
	/**
	 * @param in
	 */

	public static final int CAPACITY = 12;
	public static final int INIT_INDEX = -1;
	private final int[] NUMBERS = new int[CAPACITY];

	public int total = INIT_INDEX;

	/**
	 * @return
	 */
	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return
	 */
	public boolean callCheck() {
		return total == INIT_INDEX;
	}
	/**
	 * @return
	 */
	public boolean isFull() {
		return total == CAPACITY-1;
	}

	/**
	 * @return
	 */
	protected int peekaboo() {
		if (callCheck())
			return INIT_INDEX;
		return NUMBERS[total];
	}

	/**
	 * @return
	 */
	public int countOut() {
		if (callCheck())
			return INIT_INDEX;
		return NUMBERS[total--];
	}

}
