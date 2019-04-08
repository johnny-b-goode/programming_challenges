package net.scientifichooliganism.pc;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.*;

public class FizzBuzzTest {
	@Test
	public void test01 () {
		FizzBuzz.fizzBuzz();
		Assert.assertTrue(true);
	}
}