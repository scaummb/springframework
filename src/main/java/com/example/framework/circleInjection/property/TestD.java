package com.example.framework.circleInjection.property;

import org.springframework.context.annotation.Scope;

/**
 * @author moubin.mo
 * @date: 2021/2/16 10:34
 */
@Scope("prototype")
public class TestD {
	private TestE testE;

	public TestE getTestE() {
		return testE;
	}

	public void setTestE(TestE testE) {
		this.testE = testE;
	}
}
