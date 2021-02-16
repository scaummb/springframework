package com.example.framework.aop;

import org.aspectj.lang.annotation.Aspect;

/**
 * @author moubin.mo
 * @date: 2021/2/16 18:22
 */
@Aspect
public class TestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test() {

	}
}
