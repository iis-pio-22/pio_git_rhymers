package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	public static final int INT2 = 0;
	int totalRejected = INT2;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

//alt + ← i alt + → pozwala na przełączanie miedzy otwartymi do edycji plikami