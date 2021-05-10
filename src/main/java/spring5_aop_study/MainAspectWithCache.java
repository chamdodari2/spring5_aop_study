package spring5_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring5_aop_study.aop.AppCtxWithCache;
import spring5_aop_study.aop.Calculator;

public class MainAspectWithCache {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
		= new AnnotationConfigApplicationContext(AppCtxWithCache.class);
		
		Calculator cal = ctx.getBean("calculator",Calculator.class);
		cal.factorial(7);
		cal.factorial(7);
		cal.factorial(5);
		cal.factorial(5);
//		ctx.close();
	}

}