package com.xultaeculcis.codingChallenges.Concurrency.Blockades;

public class Counter {
    private int value;
    public synchronized int increment() {
        value++;
        return value;
    }
}