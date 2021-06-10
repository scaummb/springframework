package com.example.framework.transaction.required;

import com.example.framework.transaction.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author moubin.mo
 * @date: 2021/3/24 09:23
 */

@Transactional(propagation = Propagation.REQUIRED)
public interface UserService {
	public void save(User user) throws Exception;
}
