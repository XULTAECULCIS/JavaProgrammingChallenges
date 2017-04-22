package com.xultaeculcis.codingChallenges.Concurrency.Threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 1; i <= 100; i++) System.out.print(i + " ");  };
        Thread thread = new Thread(task); 
        thread.start();
        System.out.println("W¹tek uruchomiony.");
        thread.join();
        System.out.println("\nW¹tek do³¹czony.");
        
        Runnable interruptibleTask = () -> {
            System.out.print("\nPrzerywalne: ");
            try {
                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + " ");
                    Thread.sleep(100);
                }
            }
            catch (InterruptedException ex) {
                System.out.println("Przerwany!");
            }
        };
        
        thread = new Thread(interruptibleTask);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();         
        
        Runnable exceptionalTask = () -> {
            System.out.print("\nWyj¹tkowe: ");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
                if (i == 42) throw new IllegalStateException();
            }            
        };
        thread = new Thread(exceptionalTask);
        thread.setUncaughtExceptionHandler((t, ex) -> System.out.println("Koniec!"));
        thread.start();
        thread.join();
        
        Runnable daemonTask = () -> {
            System.out.print("\nDemon: ");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
                // if (i == 42) Thread.currentThread().setDaemon(true);
            }            
        };
        thread = new Thread(daemonTask);
        thread.setDaemon(true);
        thread.start();        
        System.out.println("\n¯egnaj demonie!");
    }    
}
