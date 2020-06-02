package com.icoom.service;

import com.icoom.domain.Account;

public interface IAccountService {

	Account findAccountById(Integer accountId);
	
	void transfer(String sourceName,String targetName,Float money);
}
