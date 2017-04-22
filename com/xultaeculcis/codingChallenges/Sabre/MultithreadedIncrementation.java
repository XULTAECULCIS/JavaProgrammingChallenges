package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class MultithreadedIncrementation {
	private static int i = 0;
	
	public static void main(String[] args) {
		Thread t1 =new IncrementThread(10000);
		Thread t2 = new IncrementThread(20000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException iex){
			iex.printStackTrace();
		}
		System.out.println(i);
	}
	
	static class IncrementThread
			extends Thread {
		private final int max;
		
		public IncrementThread(int max) {
			this.max = max;
		}
		
		public void run() {
			for (int j = 0; j < max; j++) {
				i++;
			}
		}
	}
}
