package com.xultaeculcis.codingChallenges.IO;

import java.nio.ByteBuffer;

/**
 * Created by sicluceatlux on 2017-04-15.
 */

public class ByteToLong {
	
	public static byte[] longToBytes(long x) {
		ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
		buffer.putLong(x);
		return buffer.array();
	}
	
	public static long bytesToLong(byte[] bytes) {
		ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
		buffer.put(bytes);
		buffer.flip();//need flip
		return buffer.getLong();
	}
	
	public static void main(String [] args){
		
		System.out.println(longToBytes(12345L));
		System.out.println(bytesToLong(longToBytes(12345L)));
		
	}
}
