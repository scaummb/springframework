package com.example.framework;

import com.example.framework.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * <p>自定义标签解析</p>
 * @date: 2021/1/6 18:31
 */
public class CustomXSDTagTest {
	@Test
	public void testSimpleLoad() {
		//读取配置文件,ApplicationContext 容器的使用
		ApplicationContext bf = new ClassPathXmlApplicationContext("test.xml");
		User user = (User) bf.getBean("testbean");
		System.out.println(user.getEmail() + " " + user.getUserName() + "" + user.getAge());
	}
}
