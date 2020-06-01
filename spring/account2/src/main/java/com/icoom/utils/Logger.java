package com.icoom.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类，里面提供了公共的代码
 * @author 幽静丶孤寂
 *
 */
@Component("logger")
@Aspect    //表示当前类是一个切面类
public class Logger {
	
	@Pointcut("execution(* com.icoom.service.impl.*.*(..))")
	private void pt1() {}

	/**
	 * 前置通知
	 */
//	@Before("pt1()")
	public void beforePrintLog() {
		System.out.println("Logger类中的beforePrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 后置通知
	 */
//	@AfterReturning("pt1()")
	public void afterReturningPrintLog() {
		System.out.println("Logger类中的agterReturningPrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 异常通知
	 */
//	@AfterThrowing("pt1()")
	public void afterThrowingPrintLog() {
		System.out.println("Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 最终通知
	 */
//	@After("pt1()")
	public void afterPrintLog() {
		System.out.println("Logger类中的afterPrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 环绕通知
	 */
	@Around("pt1()")
	public Object aroundPrintLog(ProceedingJoinPoint pjp) {
		Object rtValue = null;
		try {
			Object[] args = pjp.getArgs();  //得到方法执行所需的参数
			System.out.println("前置通知，aroundPringtLog方法开始");
			rtValue = pjp.proceed(args);  //明确调用业务层方法（切入点方法）
			System.out.println("后置通知");
			return rtValue;
		}catch(Throwable t) {
			System.out.println("异常通知");
			throw new RuntimeException(t);
		}finally {
			System.out.println("最终通知");
		}
	}
}
