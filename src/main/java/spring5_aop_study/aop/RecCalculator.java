package spring5_aop_study.aop;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();  //시작시간 재기
	
 
		//완료되면
//		try {
		
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
//	}finally {//완료되면 수행되는것
//		long end=System.currentTimeMillis();
//
//		System.out.printf("RecCalculator.factorial(%d) 실행시간 = %d%n",num,(end-start));
//		
//	}
	}

}
