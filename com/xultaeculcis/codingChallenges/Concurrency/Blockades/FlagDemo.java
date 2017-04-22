package com.xultaeculcis.codingChallenges.Concurrency.Blockades;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FlagDemo {
    private static Flag done = new Flag();
    
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Witaj " + i);
            done.set();
        };
        Runnable goodbye = () -> {
            int i = 1;
            while (!done.get()) i++; 
            System.out.println("¯egnaj " + i);
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);        
        executor.execute(goodbye);        
    }
}