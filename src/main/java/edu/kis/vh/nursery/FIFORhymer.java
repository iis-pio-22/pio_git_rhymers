package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {

        while (!isEmpty())
            rhymer.countIn(super.countOut());

        int number = rhymer.countOut();
        while (!rhymer.isEmpty())
            countIn(rhymer.countOut());

        return number;
    }
}
// Polecenie 3: Temat: błędy formatowania i konwencji
// Kombinacja klawiszy alt + strzalki służy do szybkiego przełączania między kartami