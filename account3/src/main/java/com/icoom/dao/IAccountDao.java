package com.icoom.dao;

import com.icoom.domain.Account;

public interface IAccountDao {

	Account findAccountById(Integer accountId);
	
	Account findAccountByName(String accountName);
	
	void updateAccount(Account account);
}
