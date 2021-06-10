package com.example.framework.transaction.newtransaction;

import com.example.framework.transaction.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moubin.mo
 * @date: 2021/3/24 10:20
 */

public class TestNewTransaction {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("transaction.xml");
		UserService2 userService2 = (UserService2) act.getBean("userService2");
		User user = new User();
		user.setAge(1222);
		user.setName("bb");
		user.setSex("girl");
		userService2.save(user);
	}
}
