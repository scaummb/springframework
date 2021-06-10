package com.example.framework.transaction.newtransaction;

import com.example.framework.transaction.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * @author moubin.mo
 * @date: 2021/3/24 10:05
 */

public class UserService2Impl implements UserService2 {
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
		UserService2 userService2 = (UserService2) act.getBean("userService2");
		try {
			userService2.exception();
		} catch (Exception e){
			System.out.println("=========== save() catch exception");
		}
	}

	@Override
	public void exception() {
		System.out.println("============ UserService2Impl excception..");
		try {
			throw new RuntimeException("123");
		} catch (Exception e){
			System.out.println("=========== catch exception");
		}
		throw new RuntimeException("123");
	}
}

