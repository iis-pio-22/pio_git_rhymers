package edu.kis.vh.nursery;

/**
 * HanoiRhymer class
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * reportRejected
     * @return totalRejected
     */
    public int reportRejected() {
        return getTotalRejected();
    }


    /**
     * countIn
     * @param in
     */

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

    /**
     * getter
     * @return totalRejected
     */
    public int getTotalRejected() {
        return totalRejected;
    }

    /**
     * setter
     * @param totalRejected
     */
    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
