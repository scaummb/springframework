package com.example.framework;

import com.example.framework.pojo.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;

/**
 * <p>spring源码小例子</p>
 * @author moubin.mo
 * @date: 2021/1/3 08:59
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assertEquals("testBean", bean.getTestStr());
	}
}
