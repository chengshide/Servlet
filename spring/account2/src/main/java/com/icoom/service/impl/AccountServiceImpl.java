package com.icoom.service.impl;

import org.springframework.stereotype.Service;

import com.icoom.service.IAccountService;

/**
 * �˻���ҵ���ʵ����
 * @author �ľ�ؼ�¼�
 *
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

	public void saveAccount() {
		System.out.println("ִ���˱���");
	}

	public void updateAccount(int i) {
		System.out.println("ִ���˸���");
	}

	public int deleteAccount() {
		System.out.println("ִ����ɾ��");
		return 0;
	}

}
