package com.xultaeculcis.codingChallenges.Concurrency.RunnableCallableDemos;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable powitania = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("Witaj " + i);
        };
        Runnable po¿egnania = () -> {
            for (int i = 1; i <= 1000; i++) 
                System.out.println("¯egnaj " + i);
        };
        
        Executor executor = Executors.newCachedThreadPool();
        executor.execute(powitania);        
        executor.execute(po¿egnania);        
    }
}