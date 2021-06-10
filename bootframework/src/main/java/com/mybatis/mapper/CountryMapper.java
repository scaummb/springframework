package com.mybatis.mapper;

import com.mybatis.entity.Country;

import java.util.List;

/**
 * @author moubin.mo
 * @date: 2021/5/3 10:28
 */

public interface CountryMapper {

	/**
	 * 查询全部国家
	 */
	List<Country> selectAll();

	/**
	 * 通过id查询国家
	 * @param id
	 * @return Country
	 */
	Country selectById(Integer id);

}
