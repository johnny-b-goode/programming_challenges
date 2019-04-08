package net.scientifichooliganism.pc;

//https://gist.github.com/johnny-b-goode/ae088a15f4d31f57f991e5be7af3376e

public class AddTwoLargeIntegers {
	public static String add (String in1, String in2) {
		String ret = new String();

		if (in1.length() > in2.length()) {
			while (in2.length() < in1.length()) {
				in2 = "0" + in2;
			}
		}
		else if (in2.length() > in1.length()) {
			while (in1.length() < in2.length()) {
				in1 = "0" + in1;
			}
		}

		int position = (in1.length() - 1);
		int carry = 0;

		while (position >= 0) {
			carry += (Integer.parseUnsignedInt(String.valueOf(in1.charAt(position))) + Integer.parseUnsignedInt(String.valueOf(in2.charAt(position))));
			String temp = String.valueOf(carry);
			//this should always be zero or one, but to play it safe we use length() - 1
			ret = String.valueOf(temp.charAt((temp.length() - 1))) + ret;

			if (temp.length() > 1) {
				carry = Integer.parseUnsignedInt(temp.substring(0, 1));
			}
			else {
				carry = 0;
			}

			position--;
		}

		if (carry > 0) {
			ret = String.valueOf(carry) + ret;
		}

		return ret;
	}
}