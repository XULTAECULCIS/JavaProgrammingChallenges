package com.xultaeculcis.codingChallenges.Concurrency.ProducerConsumerBlockingQueue;

/**
 * Created by sicluceatlux on 2017-04-14.
 */
import java.util.LinkedList;
import java.util.Queue;


public class ProducersAndConsumers {
	
	public static void main(String args[]) {
		
		final Queue sharedQ = new LinkedList();
		
		Thread producer = new Producer(sharedQ);
		Thread consumer = new Consumer(sharedQ);
		
		producer.start();
		consumer.start();
		
	}
}




