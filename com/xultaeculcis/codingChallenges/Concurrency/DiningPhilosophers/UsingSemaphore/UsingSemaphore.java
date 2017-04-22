package com.xultaeculcis.codingChallenges.Concurrency.DiningPhilosophers.UsingSemaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class UsingSemaphore {
	
	static class Fork {
		public Semaphore fork = new Semaphore(1);
		public int id;
		
		Fork(int id) {
			this.id = id;
		}
		
		public int getId() {
			return id;
		}
		
		public boolean take() {
			return fork.tryAcquire();
		}
		
		public void putDown() {
			fork.release();
		}
	}
	
	static class Philosopher
			extends Thread {
		
		private Fork fork_low;
		private Fork fork_high;
		private String name;
		
		Philosopher(Fork fork_low, Fork fork_high, String name) {
			this.fork_low = fork_low;
			this.fork_high = fork_high;
			this.name = name;
		}
		
		public String getNameOfPhilosopher() {
			return name;
		}
		
		public void run() {
			
			try {
				System.out.println("Philosopher " + getNameOfPhilosopher() + " is thinking...");
				sleep(1000);
			}
			catch (InterruptedException ex) {
			}
			
			while (true) {
				eat();
			}
		}
		
		private void eat() {
			if (fork_low.take()) {
				if (fork_high.take()) {
					try {
						System.out.println("Philosopher " + getNameOfPhilosopher() + " is eating");
						sleep(2000); // eating;
					}
					catch (InterruptedException ex) { }
					
					System.out.println("Philosopher " + getNameOfPhilosopher() + " has done eating");
					System.out.println("Philosopher " + getNameOfPhilosopher() + " puts down fork " + fork_high.getId());
					fork_high.putDown();
					System.out.println("Philosopher " + getNameOfPhilosopher() + " puts down fork " + fork_low.getId());
					fork_low.putDown();
					
				}
				else {
					fork_low.putDown();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Plato", "Aristotle", "Cicero", "Confucius", "Eratosthenes"};
		Fork[] fork = new Fork[5];
		Philosopher[] philosopher = new Philosopher[5];
		
		for (int i = 0; i < fork.length; i++) {
			fork[i] = new Fork(i);
		}
		
		for (int i = 0; i < philosopher.length; i++) {
			
			if (i != philosopher.length - 1) {
				philosopher[i] = new Philosopher(fork[i], fork[i + 1], names[i]);
				philosopher[i].start();
			}
			else {
				philosopher[i] = new Philosopher(fork[0], fork[i], names[i]);
				philosopher[i].start();
			}
		}
	}
	
	
}
