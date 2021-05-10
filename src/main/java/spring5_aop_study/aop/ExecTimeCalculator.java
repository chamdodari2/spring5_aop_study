package spring5_aop_study.aop;

public class ExecTimeCalculator implements Calculator {
	
	private Calculator delegate;

	
	
	public ExecTimeCalculator(Calculator delegate) {  //
		super();
		this.delegate = delegate;
	}



	@Override
	public long factorial(long num) {
//		long start = System.nanoTime();
		long start = System.currentTimeMillis();
		long result = delegate.factorial(num);  //요고 계산하기 전에 시간과 ㄱ
//		long end = System.nanoTime();
		long end = System.currentTimeMillis(); //이렇게 하면 쉽게 바뀌어지는거당
		System.out.printf("%s.factorial(%d) 실행시간 = %d%n",
				delegate.getClass().getSimpleName(),
				num,
				(end-start));  //delegate.getClass() 수행된 클래스이름을 가져오기 위한 문장
		return result;
	}

}
