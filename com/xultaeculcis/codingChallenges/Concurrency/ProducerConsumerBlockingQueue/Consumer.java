package com.xultaeculcis.codingChallenges.Concurrency.ProducerConsumerBlockingQueue;

import java.util.Queue;

/**
 * Created by sicluceatlux on 2017-04-14.
 */
public class Consumer extends Thread {
	private final Queue sharedQ;
	
	public Consumer(Queue sharedQ) {
		super("Consumer");
		this.sharedQ = sharedQ;
	}
	
	@Override
	public void run() {
		while(true) {
			
			synchronized (sharedQ) {
				//waiting condition - wait until Queue is not empty
				while (sharedQ.size() == 0) {
					try {
						System.out.println("Queue is empty, waiting");
						sharedQ.wait();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				int number = (int)sharedQ.poll();
				System.out.println("consuming : " + number );
				sharedQ.notify();
				
				//termination condition
				if(number == 9){break; }
			}
		}
	}
}
