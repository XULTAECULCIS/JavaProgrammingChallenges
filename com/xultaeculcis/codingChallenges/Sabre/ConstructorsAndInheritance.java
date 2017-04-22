package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class ConstructorsAndInheritance {

	static class Base{
		Base(){
			System.out.println("Base");
		}
	}
	static class Inherited extends Base{
		private Base base;
		Inherited(String name){
			base = new Base();
			System.out.println(name);
		}
	}
	
	static class Main{
		public static void main(String[] args) {
			new Inherited("Jerry");
		}
	}
}
