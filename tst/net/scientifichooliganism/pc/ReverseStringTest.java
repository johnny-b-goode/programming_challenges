package net.scientifichooliganism.pc;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.*;

public class ReverseStringTest {
	@Test
	public void test01 () {
		Assert.assertEquals("enoesactset", ReverseString.reverse1("testcaseone"));
	}

	@Test
	public void test02 () {
		Assert.assertEquals("detartrated", ReverseString.reverse1("detartrated"));
	}

	@Test
	public void test03 () {
		Assert.assertEquals("previouslybackward", ReverseString.reverse1("drawkcabylsuoiverp"));
	}

	@Test
	public void test04 () {
		Assert.assertEquals("enoesactset", ReverseString.reverse2("testcaseone"));
	}

	@Test
	public void test05 () {
		Assert.assertEquals("detartrated", ReverseString.reverse2("detartrated"));
	}

	@Test
	public void test06 () {
		Assert.assertEquals("previouslybackward", ReverseString.reverse2("drawkcabylsuoiverp"));
	}
}