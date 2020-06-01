package com.icoom.service.impl;

import org.springframework.stereotype.Service;

import com.icoom.service.IAccountService;

/**
 * 账户的业务层实现类
 * @author 幽静丶孤寂
 *
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

	public void saveAccount() {
		System.out.println("执行了保存");
	}

	public void updateAccount(int i) {
		System.out.println("执行了更新");
	}

	public int deleteAccount() {
		System.out.println("执行了删除");
		return 0;
	}

}
