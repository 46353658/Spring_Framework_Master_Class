package com.arshad.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.arshad.spring.aop.springaop..*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.arshad.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("com.arshad.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.arshad.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void allLayerExecution() {}
	
	@Pointcut("bean(dao*)")
	public void beanStartingWithDao() {}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao() {}
	
	@Pointcut("within(com.arshad.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin() {}
	
	@Pointcut("@annotation(com.arshad.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
