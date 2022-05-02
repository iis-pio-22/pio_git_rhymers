package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int ERROR_RETURN_VALUE = -1;
	public static final int TOTAL_INIT_VALUE = -1;
	public static final int MAX_ARRAY_SIZE = 12;
	public static final int MAX_ELEMENTS_COUNT = MAX_ARRAY_SIZE - 1;

	private final int[] numbers = new int[MAX_ARRAY_SIZE];

	public int total = TOTAL_INIT_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL_INIT_VALUE;
	}

	public boolean isFull() {
		return total == MAX_ELEMENTS_COUNT;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return ERROR_RETURN_VALUE;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return ERROR_RETURN_VALUE;
		}
		return numbers[total--];
	}

}

//Kombinacja klawiszy alt + strzałka lewo/prawo przełącza między kolejnymi plikami ostatnio modyfikowanymi/zapisanymi
//Strzałka w lewo przełącza z dalszymi zmianami a w prawo z ostatnimi zmianami
