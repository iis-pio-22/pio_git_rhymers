package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracajaca DefaultCountingOutRhymer*/

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracajaca DefaultCountingOutRhymer*/

	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracająca FIFORhymer()*/

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}
	/*Publiczna metoda typu DefaultCountingOutRhymer zwracajaca HanoiRhymer()*/
}
