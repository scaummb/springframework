package com.example.framework.verify;

import com.example.framework.pojo.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * <p>
 *     自定义标签解析器，继承 AbstractSingleBeanDefinitionParser，目的是解析XSD文件中的定义和组件定义
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
		String age = element.getAttribute("age");
		//将提取的数据放入 BeanDefinitionBuilder 中，待完成所有bean解析工作，再统一注册到 beanFactory 中
		if (StringUtils.hasText(userName)){
			bean.addPropertyValue("userName", userName);
		}
		if (StringUtils.hasText(email)){
			bean.addPropertyValue("email", email);
		}
		if (!StringUtils.hasText(age)){
			bean.addPropertyValue("age", 111);
		} else {
			bean.addPropertyValue("age", Integer.valueOf(age));
		}
	}
}
