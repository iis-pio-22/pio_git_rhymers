package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {

		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();
		while (!temp.callCheck())
			countIn(temp.countOut());
		
		return ret;
	}
}
// Polecenie 3: Temat: błędy formatowania i konwencji
// Kombinacja klawiszy alt + strzalki służy do szybkiego przełączania między kartami