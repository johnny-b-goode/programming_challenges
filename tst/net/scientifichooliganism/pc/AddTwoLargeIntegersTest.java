package net.scientifichooliganism.pc;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.*;

public class AddTwoLargeIntegersTest {
	@Test
	public void test01 () {
		Assert.assertEquals("8589934590", AddTwoLargeIntegers.add("4294967295", "4294967295"));
	}

	@Test
	public void test02 () {
		Assert.assertEquals("17821286498", AddTwoLargeIntegers.add("5392139375", "12429147123"));
	}

	@Test
	public void test03 () {
		Assert.assertEquals("109864985124910443311", AddTwoLargeIntegers.add("20125744073782551120", "89739241051127892191"));
	}
}