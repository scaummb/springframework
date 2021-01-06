package com.example.framework.verify;

import com.example.framework.pojo.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * <p>
 *     自定义标签解析器
 * </p>
 */

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	//Element 对应类
	protected Class getBeanClass(Element element){
		return User.class;
	}

	//Element 解析提取对应的元素
	protected void doParse(Element element, BeanDefinitionBuilder bean){
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");

		if (StringUtils.hasText(userName)){
			bean.addPropertyValue("userName", userName);
		}

		if (StringUtils.hasText(email)){
			bean.addPropertyValue("email", email);
		}

	}
}
