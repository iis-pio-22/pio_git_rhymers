package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {

		while (!callCheck())
			rhymer.countIn(super.countOut());

		int number = rhymer.countOut();
		while (!rhymer.callCheck())
			countIn(rhymer.countOut());
		
		return number;
	}
}
// Polecenie 3: Temat: błędy formatowania i konwencji
// Kombinacja klawiszy alt + strzalki służy do szybkiego przełączania między kartami