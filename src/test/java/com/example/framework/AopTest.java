package com.example.framework;

import com.example.framework.aop.TestBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moubin.mo
 * @date: 2021/2/16 18:39
 */

public class AopTest {
	@Test
	public void test(){
		ApplicationContext bf = new ClassPathXmlApplicationContext("aopTest.xml");
		TestBean testBean = (TestBean) bf.getBean("test");
		testBean.test();
	}
}
