package com.dao;

import com.po.Users;

/**
 * �û��߼���
 * @author �ľ�ؼ�¼�
 *
 */
public class UserDao {

	public boolean userLogin(Users u) {
		if(u.getUsername().equals("admin") && u.getPassword().equals("123456")) {
			return true;
		}
		return false;
	}
}
