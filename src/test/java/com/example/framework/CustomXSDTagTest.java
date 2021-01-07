package com.example.framework;

import com.example.framework.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>自定义标签解析</p>
 * @author moubin.mo
 * @date: 2021/1/6 18:31
 */

public class CustomXSDTagTest {
	public static void main(String[] args) {
		//读取配置文件
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("test.xml");
		User user = (User) bf.getBean("testbean");
		System.out.println(user.getEmail() + " " + user.getUserName() + "" + user		.getAge());
	}
}
