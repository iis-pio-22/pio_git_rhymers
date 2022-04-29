package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
	
	@Override
	public int countOut() {

<<<<<<< b0546aead947bf5b9672d72e3204c49645ae42b3
		while (!callCheck())
			rhymer.countIn(super.countOut());

		int number = rhymer.countOut();
		while (!rhymer.callCheck())
			countIn(rhymer.countOut());
=======
		while (!isEmpty())
			temp.countIn(super.countOut());

		int ret = temp.countOut();
		while (!temp.isEmpty())
			countIn(temp.countOut());
>>>>>>> changed methods names
		
		return number;
	}
}
// Polecenie 3: Temat: błędy formatowania i konwencji
// Kombinacja klawiszy alt + strzalki służy do szybkiego przełączania między kartami