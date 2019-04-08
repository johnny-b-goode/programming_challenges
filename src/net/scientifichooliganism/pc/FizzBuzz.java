package net.scientifichooliganism.pc;

//https://gist.github.com/johnny-b-goode/6761a9ee4b12c3147b5a66c03dd3492c

public class FizzBuzz {
	public static void fizzBuzz () {
		fizzBuzz(0, 100);
	}

	public static void fizzBuzz (int in1, int in2) {
		for (int i = in1; i <= in2; i++) {
			String temp = new String();

			if ((i % 3) == 0) {
				temp = "Fizz";
			}

			if ((i % 5) == 0) {
				temp += "Buzz";
			}

			if (temp.length() <= 0) {
				temp = String.valueOf(i);
			}

			System.out.println(temp);
		}
	}
}