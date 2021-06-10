package com.example.framework.singleton;

import com.example.framework.pojo.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author moubin.mo
 * @date: 2021/2/21 20:57
 */

public class FactoryBeanTest {
	@Test
	public static void main(String[] args) {
		//BeanFactory容器的使用
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("singletonBeanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("car");
	}
}
