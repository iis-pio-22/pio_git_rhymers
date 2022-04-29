package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int number) {
		if (!callCheck() && number > peekaboo())
			totalRejected++;
		else
			super.countIn(number);
	}
}
// Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
// blędy wcięć w liniach 11-16 - ciało metody countIn()
// brak wcięcia dla atrybutuw linii 5