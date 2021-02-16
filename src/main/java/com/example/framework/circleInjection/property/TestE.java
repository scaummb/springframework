package com.example.framework.circleInjection.property;

import org.springframework.context.annotation.Scope;

/**
 * @author moubin.mo
 * @date: 2021/2/16 10:34
 */
@Scope("prototype")
public class TestE {
	private TestF testF;

	public TestF getTestF() {
		return testF;
	}

	public void setTestF(TestF testF) {
		this.testF = testF;
	}
}
