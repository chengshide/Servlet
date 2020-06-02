package com.icoom.service.impl;

import com.icoom.dao.IAccountDao;
import com.icoom.domain.Account;
import com.icoom.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	private IAccountDao accountDao;
		
	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public Account findAccountById(Integer accountId) {
		return accountDao.findAccountById(accountId);
	}

	public void transfer(String sourceName, String targetName, Float money) {
		Account source = accountDao.findAccountByName(sourceName);
		Account target = accountDao.findAccountByName(targetName);
		source.setMoney(source.getMoney()-money);
		target.setMoney(target.getMoney()+money);
		accountDao.updateAccount(source);
		accountDao.updateAccount(target);

	}

}
