package com.example.framework.circleInjection.property;

import org.springframework.context.annotation.Scope;

/**
 * @author moubin.mo
 * @date: 2021/2/16 10:34
 */
@Scope("prototype")
public class TestF {

	private TestD testD;

	public TestD getTestD() {
		return testD;
	}

	public void setTestD(TestD testD) {
		this.testD = testD;
	}
}
