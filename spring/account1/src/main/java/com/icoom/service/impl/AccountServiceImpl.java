package com.icoom.service.impl;

import com.icoom.service.IAccountService;

/**
 * �˻���ҵ���ʵ����
 * @author �ľ�ؼ�¼�
 *
 */
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
