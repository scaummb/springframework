package com.boot.mybatis;

import com.mybatis.BaseMapperTest;
import com.mybatis.entity.Country;
import com.mybatis.mapper.CountryMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author moubin.mo
 * @date: 2021/5/3 10:51
 */

public class CountryMapperTest extends BaseMapperTest {

	private final static Integer COUNTRY_ID = 1;

	@Test
	public void testSelectById(){

		SqlSession sqlSession = getSqlSession();
		try {
			CountryMapper mapper = sqlSession.getMapper(CountryMapper.class);
			Country country = mapper.selectById(COUNTRY_ID);
			System.out.println(country);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectAll(){
		SqlSession sqlSession = getSqlSession();
		try {
			List<Country> countryList = sqlSession.selectList("com.mybatis.mapper.CountryMapper.selectAll");
			System.out.println(Arrays.toString(countryList.toArray()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
}
