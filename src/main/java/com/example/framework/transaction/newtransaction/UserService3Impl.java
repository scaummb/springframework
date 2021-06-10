package com.example.framework.transaction.newtransaction;

/**
 * @author moubin.mo
 * @date: 2021/3/24 15:12
 */

public class UserService3Impl implements UserService3{

	@Override
	public void exception() {
		System.out.println("UserService3Impl excception..");
		throw new RuntimeException("123");
	}
}
