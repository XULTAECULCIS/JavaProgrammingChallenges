package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class ThreadsInJava {
	void startThread(){
		Thread thread = new Thread(new MyRunnable());
		thread.setDaemon(true);
		thread.start();
	}
	
	public static void main(String[] args){
		new ThreadsInJava().startThread();
	}
	
	
	private static class MyRunnable implements Runnable{
		@Override
		public void run(){
			while(true){
				System.out.println("Hello");
			}
		}
	}
}
