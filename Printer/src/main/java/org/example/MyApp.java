package org.example;

public class MyApp {
	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();
		if(args.length > 0){
			System.out.println(calculator.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		}else {
			System.out.println("Not found");

		}


	}
}
