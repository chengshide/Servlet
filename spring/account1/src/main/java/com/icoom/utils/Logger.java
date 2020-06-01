package com.icoom.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 用于记录日志的工具类，里面提供了公共的代码
 * @author 幽静丶孤寂
 *
 */
public class Logger {

	/**
	 * 前置通知
	 */
	public void beforePrintLog() {
		System.out.println("Logger类中的beforePrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 后置通知
	 */
	public void afterReturningPrintLog() {
		System.out.println("Logger类中的agterReturningPrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 异常通知
	 */
	public void afterThrowingPrintLog() {
		System.out.println("Logger类中的afterThrowingPrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 最终通知
	 */
	public void afterPrintLog() {
		System.out.println("Logger类中的afterPrintLog方法开始记录日志了。。。");
	}
	
	/**
	 * 环绕通知
	 */
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
