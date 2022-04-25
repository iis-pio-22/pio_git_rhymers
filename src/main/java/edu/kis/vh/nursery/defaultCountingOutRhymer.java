package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int MAX = 12;
	public static final int FINAL = -1;
	private int[] NUMBERS = new int[MAX];

	public int total = FINAL;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == FINAL;
		}
		
			public boolean isFull() {
				return total == MAX+FINAL;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return FINAL;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return FINAL;
						return NUMBERS[total--];
					}

}
