package com.example.framework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author moubin.mo
 * @date: 2021/2/16 18:38
 */

public class AspectBean {
	@Pointcut("execution(* *.test(..))")
	public void test(){
		System.out.println("test");
	}

	// --前置增强
	@Before("test()")
	public void beforeTest(){
		System.out.println("before test..");
	}

	@Before("test()")
	public void beforeTest2(){
		System.out.println("before test 2..");
	}

	// --后置增强
	@After("test()")
	public void afterTest(){
		System.out.println("after test..");
	}

	@After("test()")
	public void afterTest2(){
		System.out.println("after test 2..");
	}

	// --环绕增强
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p){
		System.out.println("around before..");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable th){
			th.printStackTrace();
		}
		System.out.println("around after..");
		return o;
	}
}
