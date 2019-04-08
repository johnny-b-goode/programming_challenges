package net.scientifichooliganism.pc;

//

public class AddTwoLargeIntegers {
	public static String add (String in1, String in2) {
		String ret = new String();
		int position = in1.length();
		int carry = 0;

		if ((position < in1.length()) && (position < in2.length())) {
			carry += (Integer.parseUnsignedInt(in1.substring(position, 1) + Integer.parseUnsignedInt(in2.substring(position, 1))));
			String temp = String.valueOf(carry);
			//this should always be zero or one, but to play it safe we use length() - 1
			ret = temp.substring((temp.length() - 1), 0) + ret;

			if (temp.length() > 1) {
				carry = Integer.parseUnsignedInt(temp.substring(0, 1));
			}
			else {
				carry = 0;
			}
		}

		return ret;
	}
}