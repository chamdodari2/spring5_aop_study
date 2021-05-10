package spring5_aop_study;

import spring5_aop_study.aop.Calculator;
import spring5_aop_study.aop.ExecTimeCalculator;
import spring5_aop_study.aop.ImpeCalculator;
import spring5_aop_study.aop.RecCalculator;

public class Main {  // ImpeCalculator RecCalculator 와 수행시간 비교 ! 사실 각 클래스 안에서 수 행하고 끝내면 더 낫다 글로 이동해보장

	public static void main(String[] args) {
		test01();
		
		int num = 5;
		long result = 0;
	//	long end= 0;

		
		ExecTimeCalculator impeCalculator = new ExecTimeCalculator(new ImpeCalculator());
		result = impeCalculator.factorial(num);
		System.out.println(impeCalculator.getClass().getSimpleName());/////////////////여기 수정해야한당
		
		
		
		

		ExecTimeCalculator recCalculator = new ExecTimeCalculator(new RecCalculator());
		result = recCalculator.factorial(num);
		System.out.printf("실행시간 = %d%n",recCalculator.factorial(num));/////////////////여기 수정해야한당


	}

	private static void test01() {
		int num =5;
		long res = -1;
		long start=0;
		long end=0;
		
		Calculator impeCal = new ImpeCalculator();
//		start = System.currentTimeMillis();
		res=impeCal.factorial(num);
//		end=System.currentTimeMillis();
		
//		System.out.printf("ImpeCalculator.factorial(%d) 실행시간 = %d%n",num,(end-start));
		System.out.printf("%d! = %d%n",num,res);
		
		Calculator recCal = new RecCalculator();
//		start = System.currentTimeMillis();
		res=recCal.factorial(num);
		end=System.currentTimeMillis();
		
//		System.out.printf("RecCalculator.factorial(%d) 실행시간 = %d%n",num,(end-start));
		System.out.printf("%d! = %d%n",num,res);
		
		
		//실행시간 나오고 리커즌으로 해서 
	}

}
