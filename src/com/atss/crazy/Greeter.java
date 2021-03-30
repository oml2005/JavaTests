package com.atss.crazy;

public class Greeter {
	
	public void greeter(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String [] args) {
		Greeter greet =  new Greeter();
		Greeting hello = new HelloWorld();
		greet.greeter(hello);
	}

}
