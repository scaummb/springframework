package com.example.framework.verify;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author moubin.mo
 * @date: 2021/1/6 18:25
 */

public class MyNamespaceHandlerSupport extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
