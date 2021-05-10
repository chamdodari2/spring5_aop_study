package spring5_aop_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.config.AppCtx;

public class MainAspect {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppCtx.class);
		
		
	//	Calculator cal = ctx.getBean("recCalculator",Calculator.class);
		RecCalculator cal = ctx.getBean("calculator",RecCalculator.class);
		long fiveFact = cal.factorial(5);
		System.out.println("cal.factorial(5)=" + fiveFact);
		System.out.println(cal.getClass().getName());
		
		
		/*
		 * Calculator cal2 = ctx.getBean("recCalculator",Calculator.class); long
		 * fiveFact2 = cal2.factorial(5); System.out.println("cal.factorial(5)=" +
		 * fiveFact2); System.out.println(cal2.getClass().getName());
		 * 
		 * ctx.close();
		 */
		
		
	}

}
