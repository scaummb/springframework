package com.example.framework;

import com.example.framework.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moubin.mo
 * @date: 2021/1/6 18:31
 */

public class CustomXSDTagTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("customTag.xml");
		User user = (User) bf.getBean("testbean");
		System.out.println(user.getEmail() + " " + user.getUserName());
	}
}
