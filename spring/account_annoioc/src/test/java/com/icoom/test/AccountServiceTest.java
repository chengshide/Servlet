package com.icoom.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icoom.domain.Account;
import com.icoom.service.IAccountService;

/**
 * ʹ��Junit����
 * @author �ľ�ؼ�¼�
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

	@Autowired
	private IAccountService as;
	
	@Test
	public void testFindAll() {
		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//�õ�ҵ������
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//ִ�з���
		List<Account> accounts = as.findAllAccount();
		for(Account account:accounts) {
			System.out.println(account);
		}
	}
	
	@Test
	public void testFindOne() {
		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//�õ�ҵ������
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//ִ�з���
		Account account = as.findAccountById(1);
		System.out.println(account);
	}
	
	@Test
	public void testSave() {
		Account account = new Account();
		account.setName("test");
		account.setMoney(1234f);
		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//�õ�ҵ������
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//ִ�з���
		as.saveAccount(account);
	}
	
	@Test
	public void testUpdate() {
		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//�õ�ҵ������
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//ִ�з���
		Account account = as.findAccountById(4);
		account.setMoney(23456f);
		as.updateAccount(account);
	}
	
	@Test
	public void testDeletel() {
//		//��ȡ����
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//�õ�ҵ������
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//ִ�з���
		as.deleteAccount(4);
	}
}
