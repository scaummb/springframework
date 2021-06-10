package com.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * <p>
 *     基础映射类，实现了：获取 SqlSessionFactory
 * </p>
 * @author moubin.mo
 * @date: 2021/5/3 10:56
 */

public class BaseMapperTest {

	private static SqlSessionFactory sqlSessionFactory;

	@BeforeClass
	public static void init(){
		try{
			Reader reader = Resources.getResourceAsReader("mapper/mybatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException ignore){
			ignore.printStackTrace();
		}
	}

	public SqlSession getSqlSession(){
		return sqlSessionFactory.openSession();
	}

}
