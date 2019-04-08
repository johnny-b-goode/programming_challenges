package net.scientifichooliganism.pc;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.*;

public class EuclidTest {
	@Test
	public void test01 () {
		Assert.assertEquals(Euclid.euclid1(1071, 462), 21, 0);
	}

	@Test
	public void test02 () {
		Assert.assertEquals(Euclid.euclid1(242879, 157157), 14287, 0);
	}

	@Test
	public void test03 () {
		Assert.assertEquals(Euclid.euclid1(7919, 919), 1, 0);
	}

	@Test
	public void test04 () {
		Assert.assertEquals(Euclid.euclid1(761862, 123), 123, 0);
	}


	@Test
	public void test05 () {
		Assert.assertEquals(Euclid.euclid2(1071, 462), 21, 0);
	}

	@Test
	public void test06 () {
		Assert.assertEquals(Euclid.euclid2(242879, 157157), 14287, 0);
	}

	@Test
	public void test07 () {
		Assert.assertEquals(Euclid.euclid2(7919, 919), 1, 0);
	}

	@Test
	public void test08 () {
		Assert.assertEquals(Euclid.euclid2(761862, 123), 123, 0);
	}


	@Test
	public void test09 () {
		Assert.assertEquals(Euclid.euclid3(1071, 462), 21, 0);
	}

	@Test
	public void test10 () {
		Assert.assertEquals(Euclid.euclid3(242879, 157157), 14287, 0);
	}

	@Test
	public void test11 () {
		Assert.assertEquals(Euclid.euclid3(7919, 919), 1, 0);
	}

	@Test
	public void test12 () {
		Assert.assertEquals(Euclid.euclid3(761862, 123), 123, 0);
	}
}