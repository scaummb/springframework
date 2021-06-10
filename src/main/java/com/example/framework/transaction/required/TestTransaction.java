package com.example.framework.transaction.required;

import com.example.framework.transaction.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moubin.mo
 * @date: 2021/3/24 10:20
 */

public class TestTransaction {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("transaction.xml");
		UserService userService = (UserService) act.getBean("userService");
		User user = new User();
		user.setAge(12);
		user.setName("aa");
		user.setSex("男");
		userService.save(user);
	}
}
