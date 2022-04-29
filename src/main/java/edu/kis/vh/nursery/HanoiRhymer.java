package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

<<<<<<< b0546aead947bf5b9672d72e3204c49645ae42b3
	public void countIn(int number) {
		if (!callCheck() && number > peekaboo())
=======
	public void countIn(int in) {
		if (!isEmpty() && in > peekaboo())
>>>>>>> changed methods names
			totalRejected++;
		else
			super.countIn(number);
	}
}
// Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane?
// blędy wcięć w liniach 11-16 - ciało metody countIn()
// brak wcięcia dla atrybutuw linii 5