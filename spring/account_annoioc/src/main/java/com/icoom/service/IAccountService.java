package com.icoom.service;

import java.util.List;

import com.icoom.domain.Account;

/**
 * �˻���ҵ���ӿ�
 * @author �ľ�ؼ�¼�
 *
 */
public interface IAccountService {

	/**
	 * ��ѯ����
	 * @return
	 */
	List<Account> findAllAccount();
	
	/**
	 * ͨ��iD��ѯһ��
	 * @param accountId
	 * @return
	 */
	Account findAccountById(Integer accountId);
	
	/**
	 * ����
	 * @param account
	 */
	void saveAccount(Account account);
	
	/**
	 * ����
	 * @param account
	 */
	void updateAccount(Account account);
	
	/**
	 * ɾ��
	 * @param accountId
	 */
	void deleteAccount(Integer accountId);
	
	
}
