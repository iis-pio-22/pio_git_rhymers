package edu.kis.vh.nursery;


/**
 * @author Student
 * Klasa służy do liczenia rymów 
 */

public class DefaultCountingOutRhymer {

	/**
	 * ERROR_RETURN VALUE - zmienna stała zwracająca wartość pustej tablicy rymów
	 * TOTAL_INIT_VALUE - zmienna stała ustawiająca początkowy index pustej tablicy rymów
	 * MAX_ARRAY_SIZE - zmienna stała określająca maksymalny rozmiar tablicy rymów
	 * MAX_ELEMENTS_COUNT - zmienna stała określająca ostatni index tablicy rymów, zależy od zmiennej MAX_ARRAY_SIZE
	 */
	private static final int ERROR_RETURN_VALUE = -1;
	private static final int TOTAL_INIT_VALUE = -1;
	private static final int MAX_ARRAY_SIZE = 12;
	private static final int MAX_ELEMENTS_COUNT = MAX_ARRAY_SIZE - 1;

	/**
	 * Zmienna tablicowa przechowująca ilość rymów
	 */
	private final int[] numbers = new int[MAX_ARRAY_SIZE];

	/**
	 * Zmienna określająca kolejne indexy w tablicy rymów
	 */
	private int total = TOTAL_INIT_VALUE;

	/**
	 * @return metoda zwraca obecną liczbę rymów
 	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Metoda dolicza kolejną ilość rymów do tablicy rymów
	 * @param in - liczba rymów do wpisania
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Metoda sprawdza czy tablica rymów jest pusta
	 * @return zwraca true jeśli tablica jest pusta lub false w przeciwnym razie
	 */
	public boolean callCheck() {
		return total == TOTAL_INIT_VALUE;
	}

	/**
	 * Metoda sprawdza czy tablica rymów jest pełna
	 * @return zwraca true jeśli tablica jest pełna lub false w przeciwnym razie
	 */
	public boolean isFull() {
		return total == MAX_ELEMENTS_COUNT;
	}

	/**
	 * @return zwraca ilość rymów wpisaną ostatnio do tablicy
	 */
	protected int peekaboo() {
		if (callCheck()) {
			return ERROR_RETURN_VALUE;
		}
		return numbers[total];
	}

	/**
	 * @return zwraca ilość rymów wpisaną ostatnio do tablicy
	 * Jednocześnie metoda usuwa zwrócony element z tablicy poprzez dekrementacje indeksu
	 */
	public int countOut() {
		if (callCheck()) {
			return ERROR_RETURN_VALUE;
		}
		return numbers[total--];
	}

}



//Kombinacja klawiszy alt + strzałka lewo/prawo przełącza między kolejnymi plikami ostatnio modyfikowanymi/zapisanymi
//Strzałka w lewo przełącza z dalszymi zmianami a w prawo z ostatnimi zmianami
