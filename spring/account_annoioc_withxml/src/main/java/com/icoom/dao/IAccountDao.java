package com.icoom.dao;

import java.util.List;

import com.icoom.domain.Account;

/**
 * 账户的持久层接口
 * @author 幽静丶孤寂
 *
 */
public interface IAccountDao {

	/**
	 * 查询所有
	 * @return
	 */
	List<Account> findAllAccount();
	
	/**
	 * 通过iD查询一个
	 * @param accountId
	 * @return
	 */
	Account findAccountById(Integer accountId);
	
	/**
	 * 保存
	 * @param account
	 */
	void saveAccount(Account account);
	
	/**
	 * 更新
	 * @param account
	 */
	void updateAccount(Account account);
	
	/**
	 * 删除
	 * @param accountId
	 */
	void deleteAccount(Integer accountId);
}
