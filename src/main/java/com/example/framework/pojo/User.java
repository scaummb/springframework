package com.example.framework.pojo;

/**
 * @author moubin.mo
 * @date: 2021/1/6 18:02
 */

public class User {
	private String userName;
	private String email;
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
