package com.example.framework.verify;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * <p>
 *     命名空间：继承 NamespaceHandlerSupport，目的是将组件注册到Spring容器
 * </p>
 */
public class MyNamespaceHandlerSupport extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",
				new UserBeanDefinitionParser());
	}
}
