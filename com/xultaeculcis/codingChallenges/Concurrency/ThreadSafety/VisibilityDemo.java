package com.xultaeculcis.codingChallenges.Concurrency.ThreadSafety;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class VisibilityDemo {
    private static boolean done = false; // add volatile
    
    public static void main(String[] args) {
        Runnable hellos = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Witaj " + i);
            done = true;
        };
        Runnable goodbye = () -> {
            int i = 1;
            while (!done) i++; 
            System.out.println("¯egnaj " + i);
        };
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(hellos);        
        executor.execute(goodbye);        
    }
}