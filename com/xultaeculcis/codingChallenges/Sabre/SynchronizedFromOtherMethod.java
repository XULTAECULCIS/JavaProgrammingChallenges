package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class SynchronizedFromOtherMethod {
	
	public static class MyRunnable implements Runnable{
		public synchronized void foo1(){
			foo2();
			System.out.println("Foo1");
		}
		private synchronized  void foo2() {
			System.out.println("Foo2");
		}
		@Override
		public void run(){
			foo1();
		}
	}
	
	public static void main(String[] args){
		Thread myThread = new Thread(new MyRunnable());
		myThread.start();
	}
}
