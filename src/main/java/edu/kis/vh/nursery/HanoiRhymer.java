package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}


	@Override
	public void countIn(int number) {
		if (!isEmpty() && number > peekaboo())
			totalRejected++;
		else
			super.countIn(number);
	}
}
// Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
// blędy wcięć w liniach 11-16 - ciało metody countIn()
// brak wcięcia dla atrybutuw linii 5