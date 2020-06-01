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
 * 使用Junit测试
 * @author 幽静丶孤寂
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

	@Autowired
	private IAccountService as;
	
	@Test
	public void testFindAll() {
		//获取容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		List<Account> accounts = as.findAllAccount();
		for(Account account:accounts) {
			System.out.println(account);
		}
	}
	
	@Test
	public void testFindOne() {
		//获取容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		Account account = as.findAccountById(1);
		System.out.println(account);
	}
	
	@Test
	public void testSave() {
		Account account = new Account();
		account.setName("test");
		account.setMoney(1234f);
		//获取容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		as.saveAccount(account);
	}
	
	@Test
	public void testUpdate() {
		//获取容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		Account account = as.findAccountById(4);
		account.setMoney(23456f);
		as.updateAccount(account);
	}
	
	@Test
	public void testDeletel() {
//		//获取容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		as.deleteAccount(4);
	}
}
