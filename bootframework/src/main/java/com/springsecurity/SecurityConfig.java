package com.springsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @EnableWebSecurity: 启用Web安全功能
 * @EnableWebSecurity注解：启用Web安全功能（但其本身并没有什么用处，Spring Security的配置类还需实现WebSecurityConfigurer或继承WebSecurityConfigurerAdapter类，本Demo中采用后者，因为更简单去配置使用）
 *
 * @EnableWebMvcSecurity注解：在Spring 4.0中已弃用
 *
 *
 * @author moubin.mo
 * @date: 2021/5/23 13:53
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				//访问"/"和"/home"路径的请求都允许
				.antMatchers("/", "/home","/staff","/staff/*")
				.permitAll()
				//而其他的请求都需要认证
				.anyRequest()
				.authenticated()
				.and()
				//修改Spring Security默认的登陆界面
				.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
				.logout()
				.permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//基于内存来存储用户信息
		auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
				.withUser("user").password(new BCryptPasswordEncoder().encode("123")).roles("USER").and()
				.withUser("admin").password(new BCryptPasswordEncoder().encode("456")).roles("USER","ADMIN");
	}
}
