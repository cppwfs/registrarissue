package io.spring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Glenn Renfro
 */
public class MyRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware {
	private Environment env;

	@Override
	public void setEnvironment(Environment environment) {
		this.env = environment;
	}

	@Override
	public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
// This will work if we only run this code once.  Hence set the 2 to 1 and it will work.
		for(int i = 0; i < 2; i++) {

			BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(TestBeanBFactory.class);
			builder.addConstructorArgReference("testBeanA");

			registry.registerBeanDefinition("testBeanB" + i, builder.getBeanDefinition());
		}

	}
}
