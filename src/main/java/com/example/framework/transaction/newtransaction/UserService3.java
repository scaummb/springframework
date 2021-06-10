package com.example.framework.transaction.newtransaction;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author moubin.mo
 * @date: 2021/3/24 15:12
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface UserService3 {
	void exception();
}
