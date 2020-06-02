package com.icoom.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.icoom.dao.IAccountDao;
import com.icoom.domain.Account;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

	public Account findAccountById(Integer id) {
		List<Account> accounts = super.getJdbcTemplate().query("select * from account where id = ?",new BeanPropertyRowMapper<Account>(Account.class),id);
		return accounts.isEmpty()?null:accounts.get(0);
	}

	public Account findAccountByName(String accountName) {
		List<Account> accounts = super.getJdbcTemplate().query("select * from account where name = ?",new BeanPropertyRowMapper<Account>(Account.class),accountName);
		if(accounts.isEmpty()) {
			return null;
		}
		if(accounts.size()>1) {
			throw new RuntimeException("结果集不唯一");
		}
		return accounts.get(0);
	}

	public void updateAccount(Account account) {
		super.getJdbcTemplate().update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
	}

}
