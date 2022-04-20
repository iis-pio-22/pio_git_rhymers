package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck()) {
			return -1;
		}
		return numbers[total];
	}

	public int countOut() {
		if (callCheck()) {
			return -1;
		}
		return numbers[total--];
	}

}

//Kombinacja klawiszy alt + strzałka lewo/prawo przełącza między kolejnymi plikami ostatnio modyfikowanymi/zapisanymi
//Strzałka w lewo przełącza z dalszymi zmianami a w prawo z ostatnimi zmianami
