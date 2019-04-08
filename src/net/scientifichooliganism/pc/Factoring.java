package net.scientifichooliganism.pc;

//https://gist.github.com/johnny-b-goode/2bfab417e88ca2f1dc0613c3e539d8b4

public class Factoring {
	public static String factor1 (int in) {
		if (in <= 0) {
			throw new RuntimeException("factor1(int) int must be greater than zero");
		}

		String ret = new String();
		int counter = 2;
		int control = in;

		while (counter <= control) {
			if ((control % counter) == 0) {
				if (ret.length() > 0) {
					ret = ret + " x ";
				}

				ret = ret + String.valueOf(counter);
				control = (control / counter);
			}
			else {
				counter++;
			}
		}

		return ret;
	}

	public static String factor2 (int in) {
		if (in <= 0) {
			throw new RuntimeException("factor2(int) int must be greater than zero");
		}

		String ret = new String();

		for (int i = 2; i < in; i++) {
			if ((in % i) == 0) {
				ret = String.valueOf(i) + " x " + factor2((in / i));
				i = in;
			}
		}

		if (ret.isEmpty()) {
			ret = String.valueOf(in);
		}

		return ret;
	}
}