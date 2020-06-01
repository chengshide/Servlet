package com.icoom.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icoom.domain.Account;
import com.icoom.service.IAccountService;

import config.SpringConfiguration;

/**
 * 使用Junit测试
 * String整合Junit的配置
 *     1、导入spring整合junit的jar（坐标）
 *     2、使用Junit提供的一个注解把原有额main方法替换了，替换成spring提供的@Runwith
 *     3、告知spring的运行器，spring和ioc创建是基于xml还是注解，并且说明位置
 *        @ContextConfiguretion
 *           locations:指定xml文件的位置，加上classpath关键字，表示在类路径下
 *           classes:指定注解类所在位置
 *    当使用spring 5.x版本的时候，要求Junit的jar必须是4.12及以上
 * @author 幽静丶孤寂
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

	@Autowired
	private IAccountService as;
	
	@Test
	public void testFindAll() {
//		//获取容器
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
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
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
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
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		as.saveAccount(account);
	}
	
	@Test
	public void testUpdate() {
		//获取容器
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		Account account = as.findAccountById(4);
		account.setMoney(23456f);
		as.updateAccount(account);
	}
	
	@Test
	public void testDeletel() {
		//获取容器
//		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		//得到业务层对象
//		IAccountService as = ac.getBean("accountService",IAccountService.class);
		//执行方法
		as.deleteAccount(4);
	}
}
