package com.icoom.service;

/**
 * �˻���ҵ���ӿ�
 * @author �ľ�ؼ�¼�
 *
 */
public interface IAccountService {
	
	/**
	 * ģ�Ᵽ���˻�
	 */
	void saveAccount();
	
	/**
	 * ģ������˻�
	 * @param i
	 */
	void updateAccount(int i);
	
	/**
	 * ɾ���˻�
	 */
	int deleteAccount();

}
