package com.arshad.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.arshad.spring.aop.springaop..*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.arshad.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
}
