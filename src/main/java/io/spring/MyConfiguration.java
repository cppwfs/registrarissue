package io.spring;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Glenn Renfro
 */
@Configuration
@Import(MyRegistrar.class)
public class MyConfiguration {

	@Autowired
	private DataSource dataSource;

	@Bean
	public TestBeanA testBeanA() {
		return new TestBeanA();
	}


//	@Bean
//	public TaskRepository taskRepository() {
//		return new SimpleTaskRepository(new TaskExecutionDaoFactoryBean(dataSource));
//	}

}
