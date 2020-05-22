package com.dao;

import com.po.Users;

/**
 * ÓÃ»§Âß¼­Àà
 * @author ÓÄ¾²Ø¼¹Â¼Å
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
