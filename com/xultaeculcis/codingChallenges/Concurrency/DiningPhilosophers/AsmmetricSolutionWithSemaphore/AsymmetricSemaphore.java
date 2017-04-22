package com.xultaeculcis.codingChallenges.Concurrency.DiningPhilosophers.AsmmetricSolutionWithSemaphore;

import java.util.concurrent.Semaphore;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class AsymmetricSemaphore {
	
	static class Fork {
		private int id;
		private Semaphore fork = new Semaphore(1);
		
		public Fork(int id) {
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
		private final long id;
		private Fork left;
		private Fork right;
		
		Philosopher(Fork left, Fork right, int id) {
			this.id = id;
			this.left = left;
			this.right = right;
		}
		
		public long getId() {
			return id;
		}
		
		public void run() {
			try {
				System.out.println("Philosopher " + getId() + " is thinking...");
				sleep(1000);
			}
			catch (InterruptedException ex) {
			}
			
			while (true) {
				eat();
			}
		}
		
		public void eat() {
			if (getId() % 2 == 0) {
				if (left.take()) {
					if (right.take()) {
						try {
							System.out.println("Philosopher " + getId() + " is eating");
							sleep(1000); // eating;
						}
						catch (InterruptedException ex) { }
						
						System.out.println("Philosopher " + getId() + " has done eating");
						System.out.println("Philosopher " + getId() + " puts down fork " + right.getId());
						right.putDown();
						System.out.println("Philosopher " + getId() + " puts down fork " + left.getId());
						left.putDown();
						
					}
					else {
						left.putDown();
					}
				}
			}
			else{
				if (right.take()) {
					if (left.take()) {
						try {
							System.out.println("Philosopher " + getId() + " is eating");
							sleep(1000); // eating;
						}
						catch (InterruptedException ex) { }
						
						System.out.println("Philosopher " + getId() + " has done eating");
						System.out.println("Philosopher " + getId() + " puts down fork " + left.getId());
						left.putDown();
						System.out.println("Philosopher " + getId() + " puts down fork " + right.getId());
						right.putDown();
						
					}
					else {
						right.putDown();
					}
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		Fork[] fork = new Fork[5];
		Philosopher[] philosopher = new Philosopher[5];
		
		for (int i = 0; i < fork.length; i++) {
			fork[i] = new Fork(i);
		}
		
		for (int i = 0; i < philosopher.length; i++) {
			
			if (i != philosopher.length - 1) {
				philosopher[i] = new Philosopher(fork[i], fork[i + 1], i);
				philosopher[i].start();
			}
			else {
				philosopher[i] = new Philosopher(fork[0], fork[i], i);
				philosopher[i].start();
			}
		}
	}
	
}
