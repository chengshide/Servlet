package com.icoom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icoom.dao.IAccountDao;
import com.icoom.domain.Account;
import com.icoom.service.IAccountService;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
	
	@Autowired
	private IAccountDao accountDao;

	public List<Account> findAllAccount() {
		return accountDao.findAllAccount();
	}

	public Account findAccountById(Integer accountId) {
		return accountDao.findAccountById(accountId);
	}

	public void saveAccount(Account account) {
		accountDao.saveAccount(account);
	}

	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}

	public void deleteAccount(Integer accountId) {
		accountDao.deleteAccount(accountId);
	}

}
