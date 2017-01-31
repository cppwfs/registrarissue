package io.spring;

import javax.xml.ws.FaultAction;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Glenn Renfro
 */
public class TestBeanBFactory implements FactoryBean<TestBeanB> {

	private TestBeanA testBeanA;

	public TestBeanBFactory(TestBeanA testBeanA) {
		this.testBeanA = testBeanA;
	}

	@Override
	public TestBeanB getObject() throws Exception {
		return new TestBeanB(testBeanA);
	}

	@Override
	public Class<?> getObjectType() {
		return TestBeanB.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
