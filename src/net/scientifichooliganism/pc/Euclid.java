package net.scientifichooliganism.pc;

//https://gist.github.com/johnny-b-goode/152784513851f28e9bec

public class Euclid {

	public static int euclid1 (int in1, int in2) {
		if ((in1 <= 0) || (in2 <= 0)) {
			throw new RuntimeException("euclid1(int, int) int must be greater than zero");
		}

		int ret = 0;
		int smaller = 0;
		int larger = 0;

		if (in1 > in2) {
			smaller = in2;
			larger = in1;
		}
		else {
			smaller = in1;
			larger = in2;
		}

		while (ret == 0) {
			while (smaller < larger) {
				larger = larger - smaller;
			}

			if (larger < smaller) {
				int temp = larger;
				larger = smaller;
				smaller = temp;
			}
			else if (larger == smaller) {
				ret = smaller;
			}
		}

		return ret;
	}

	public static int euclid2 (int in1, int in2) {
		if ((in1 <= 0) || (in2 <= 0)) {
			throw new RuntimeException("euclid2(int, int) int must be greater than zero");
		}

		int ret = 0;

		if (in2 > in1) {
			ret = euclid2(in2, in1);
		}
		else {
			while (in1 > in2) {
				in1 -= in2;
			}

			if (in1 < in2) {
				ret = euclid2(in2, in1);
			}
			else if (in2 == in1) {
				ret = in1;
			}
		}

		return ret;
	}

	public static int euclid3 (int in1, int in2) {
		if ((in1 <= 0) || (in2 <= 0)) {
			throw new RuntimeException("euclid3(int, int) int must be greater than zero");
		}

		int ret = 0;

		if (in2 > in1) {
			ret = euclid3(in2, in1);
		}
		else {
			if ((in1 % in2) == 0) {
				ret = in2;
			}
			else {
				ret = euclid3(in2, (in1 % in2));
			}
		}

		return ret;
	}
}