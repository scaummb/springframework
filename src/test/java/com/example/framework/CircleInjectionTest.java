package com.example.framework;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *     构造器循环依赖
 * </p>
 */

public class CircleInjectionTest {
	@Test(expected = BeanCurrentlyInCreationException.class)
	public void testCircleInjectionOfContructor(){
		try {
			new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		} catch (Exception e){
			Throwable cause = e.getCause().getCause().getCause();
			cause.printStackTrace();
		}
	}
}
