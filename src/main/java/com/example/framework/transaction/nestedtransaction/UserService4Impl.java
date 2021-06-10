package com.example.framework.transaction.nestedtransaction;

import com.example.framework.transaction.User;
import com.example.framework.transaction.newtransaction.UserService3Impl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * @author moubin.mo
 * @date: 2021/3/24 10:05
 */

public class UserService4Impl implements UserService4 {
	private JdbcTemplate jdbcTemplate;
	private UserService3Impl userService3;

	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setUserService3(UserService3Impl userService3) {
		this.userService3 = userService3;
	}

	@Override
	public void save(User user) throws Exception{
		jdbcTemplate.update("insert into user(name,age,sex) values (?,?,?)",
				new Object[]{user.getName(), user.getAge(), user.getSex()},
				new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});

		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("transaction.xml");
		UserService4 userService4 = (UserService4) act.getBean("userService4");
//		try {
//			userService4.exception();
//		} catch (Exception e){
//			System.out.println("=========== save() catch exception");
//		}
		userService4.exception();

		//外层异常
		throw new RuntimeException("123");
	}

	@Override
	public void exception() {
		System.out.println("============ UserService2Impl excception..");
		try {
			throw new RuntimeException("123");
		} catch (Exception e){
			System.out.println("=========== catch exception");
		}
		jdbcTemplate.update("insert into user(name,age,sex) values (?,?,?)",
				new Object[]{"neibu", 123, "sexceshi1"},
				new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});

//		throw new RuntimeException("123");
	}
}

