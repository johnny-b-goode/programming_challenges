package net.scientifichooliganism.pc;

//https://gist.github.com/johnny-b-goode/beaf005df0c54a765f00

public class ReverseString {
	public static String reverse1 (String in1) {
		String ret = new String();

		for (int i = (in1.length() - 1); i >= 0; i--) {
			ret += in1.charAt(i);
		}

		return ret;
	}

	public static String reverse2 (String in1) {
		String ret = new String();

		for (int i = 0; i < in1.length(); i++) {
			ret += in1.charAt(((in1.length() - 1) - i));
		}

		return ret;
	}
}