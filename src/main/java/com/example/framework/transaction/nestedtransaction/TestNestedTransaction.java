package com.example.framework.transaction.nestedtransaction;

import com.example.framework.transaction.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moubin.mo
 * @date: 2021/3/24 10:20
 */

public class TestNestedTransaction {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("transaction.xml");
		UserService4 userService4 = (UserService4) act.getBean("userService4");
		User user = new User();
		user.setAge(23);
		user.setName("waiceng");
		user.setSex("hahaha");
		userService4.save(user);
	}
}
