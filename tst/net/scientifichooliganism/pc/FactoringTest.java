package net.scientifichooliganism.pc;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.*;

public class FactoringTest {
	@Test
	public void test01 () {
		Assert.assertEquals("2 x 5", Factoring.factor1(10));
	}

	@Test
	public void test02 () {
		Assert.assertEquals("2 x 2 x 2 x 3", Factoring.factor1(24));
	}

	@Test
	public void test03 () {
		Assert.assertEquals("7919", Factoring.factor1(7919));
	}


	@Test
	public void test04 () {
		Assert.assertEquals("2 x 5", Factoring.factor2(10));
	}

	@Test
	public void test05 () {
		Assert.assertEquals("2 x 2 x 2 x 3", Factoring.factor2(24));
	}

	@Test
	public void test06 () {
		Assert.assertEquals("7919", Factoring.factor2(7919));
	}
}