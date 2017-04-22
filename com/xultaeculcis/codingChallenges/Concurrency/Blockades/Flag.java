package com.xultaeculcis.codingChallenges.Concurrency.Blockades;

public class Flag {
    private boolean done;
    public synchronized void set() { done = true; }
    public synchronized boolean get() { return done; }
}