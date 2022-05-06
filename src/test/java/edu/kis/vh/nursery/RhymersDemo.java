package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        testRhymers(factory);

    }

    private static void testRhymers(RhymersFactory factory) {
        int numbers = 15;
        DefaultCountingOutRhymer[] rhymers = generateDefaultCountingOutRhymers(factory);
        fillRhymers(rhymers, numbers);

        int bound = 20;
        DefaultCountingOutRhymer rhymer = rhymers[3];
        countInGivenRhymer(numbers, bound, rhymer);
        printTable(rhymers);
        raportRejected(rhymers);
    }

    private static DefaultCountingOutRhymer[] generateDefaultCountingOutRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(), factory.getFIFORhymer(), factory.getHanoiRhymer()};
        return rhymers;
    }

    private static void fillRhymers(DefaultCountingOutRhymer[] rhymers, int size) {
        for (int i = 1; i < size; i++)
            for (int j = 0; j < rhymers.length; j++)
                rhymers[j].countIn(i);
    }

    private static void printTable(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].isEmpty()) System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
    }

    private static void countInGivenRhymer(int numbers, int bound, DefaultCountingOutRhymer rhymer) {
        java.util.Random random = new java.util.Random();
        for (int i = 1; i < numbers; i++)
            rhymer.countIn(random.nextInt(bound));
    }

    private static void raportRejected(DefaultCountingOutRhymer[] rhymers) {
        System.out.println("total rejected is " + ((HanoiRhymer) rhymers[3]).reportRejected());
    }
}