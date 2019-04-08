package net.scientifichooliganism.pc;

//https://gist.github.com/johnny-b-goode/45919cda4b46a7c44d6bad3bb5abee89

public class FibonacciNumbers {
	public static void fibonacciNumbers () {
		int first = 1;
		int second = 1;

		System.out.println(first);
		System.out.println(second);

		for (int i = 0; i < 8; i++) {
			int temp = first + second;
			first = second;
			second = temp;
			System.out.println(second);
		}
	}
}