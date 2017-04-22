package com.xultaeculcis.codingChallenges.Concurrency.ProducerConsumerBlockingQueue;

import java.util.Queue;

/**
 * Created by sicluceatlux on 2017-04-14.
 */
public class Producer extends Thread {
	private final Queue sharedQ;
	
	public Producer(Queue sharedQ) {
		super("Producer");
		this.sharedQ = sharedQ;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			synchronized (sharedQ) {
				//waiting condition - wait until Queue is not empty
				while (sharedQ.size() >= 2) {
					try {
						System.out.println("Queue is full, waiting");
						sharedQ.wait();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("producing : " + i);
				sharedQ.add(i);
				sharedQ.notify();
			}
		}
	}
}
