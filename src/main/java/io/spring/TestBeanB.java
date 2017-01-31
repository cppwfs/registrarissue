package io.spring;

/**
 * @author Glenn Renfro
 */
public class TestBeanB {

	private TestBeanA testBeanA;

	public TestBeanB (TestBeanA testBeanA) {
		this.testBeanA = testBeanA;

	}
}
