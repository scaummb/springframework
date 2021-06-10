package com.example.framework.transaction.required;

import com.example.framework.transaction.User;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.awt.*;
import java.sql.Types;

/**
 * @author moubin.mo
 * @date: 2021/3/24 10:05
 */

public class UserServiceImpl implements UserService {
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(User user) throws Exception{
		jdbcTemplate.update("insert into user(name,age,sex) values (?,?,?)",
				new Object[]{user.getName(), user.getAge(), user.getSex()},
				new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
		//test transaction rollback
//		throw new RuntimeException("aa");//RuntimeException ，触发事务回滚
//		throw new NullPointerException("aa"); //RuntimeException 子类，触发事务回滚
		throw new AWTException("12"); //非 RuntimeException 或者 RuntimeException 子类,不会触发事务回滚
	}
}

