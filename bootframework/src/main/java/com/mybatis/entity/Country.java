package com.mybatis.entity;

import com.util.StringHelper;

/**
 * @author moubin.mo
 * @date: 2021/5/2 18:28
 */

public class Country {
	private Integer id;
	private String countryname;
	private String countrycode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public Country(Integer id, String countryname, String countrycode) {
		this.id = id;
		this.countryname = countryname;
		this.countrycode = countrycode;
	}

	@Override
	public String toString() {
		return StringHelper.toJsonString(this);
	}
}
