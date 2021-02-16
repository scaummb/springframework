package com.example.framework;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *     多例循环依赖
 * </p>
 */

public class CircleInjectionOfProperty {
	@Test
	public void test(){
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
			System.out.println(ctx.getBean("testD"));
		} catch (Exception e){
			Throwable cause = e.getCause().getCause().getCause();
			cause.printStackTrace();
		}
	}
}
