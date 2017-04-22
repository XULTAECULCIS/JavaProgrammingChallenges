package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class ProcessingThreads extends Thread{
	private int i = 0;
	
	public ProcessingThreads(){
		setDaemon(true);
	}
	
	public void run() {
		while(!isInterrupted()){
			i++;
		}
		System.out.println("Thread terminated!");
	}
	
	public static void main(String[] args){
		Thread t1 = new ProcessingThreads();
		Thread t2 = new ProcessingThreads();
		Thread t3 = new ProcessingThreads();
		
		t1.run();
		t2.run();
		t3.run();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException iex){
			System.out.println("Interrupted");
		}
		System.exit(1);
	}
}
