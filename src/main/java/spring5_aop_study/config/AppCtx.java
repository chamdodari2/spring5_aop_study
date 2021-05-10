package spring5_aop_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.ImpeCalculator;
import spring5_aop_study.aop.RecCalculator;
import spring5_aop_study.aspect.ExeTimeAspect;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) //요고추가하면 에러이제 안뜬다.
public class AppCtx {
	
//	@Bean
//	public ImpeCalculator impeCalculator() {
//		return new ImpeCalculator();
//	}
	@Bean
	public Calculator calculator() {
		return new RecCalculator();
	}
	
	
	@Bean
	public ExeTimeAspect exeTimeAspect() {
		return new ExeTimeAspect();
	}
	
	/*
	 * @Bean public Calculator calculator() { return new RecCalculator(); }
	 */

}
