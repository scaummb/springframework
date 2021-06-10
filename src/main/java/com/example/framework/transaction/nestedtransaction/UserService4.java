package com.example.framework.transaction.nestedtransaction;

import com.example.framework.transaction.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *     事务级别：类注解=NOT_SUPPORTED ， 方法注解=REQUIRES_NEW
 *     同时存在时，以方法注解为准
 * </p>
 * @author moubin.mo
 * @date: 2021/3/24 09:23
 */
@Transactional(propagation = Propagation.NESTED)
public interface UserService4 {
	public void save(User user) throws Exception;
	void exception();
}
