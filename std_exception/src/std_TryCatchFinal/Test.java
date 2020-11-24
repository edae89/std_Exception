package std_TryCatchFinal;

public class Test {

	public void shouldBeRun() {
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		int c;
		
		try {
			c = 4/ 0;				//ArithmeticException발생
			//tc.shouldBeRun();		//exception 발생으로 해당 구문이 실행되지 않을 것이므로 finally를 활용
		}catch(ArithmeticException e) {
			c = -1;
		}finally {
			t.shouldBeRun();		//exception이 발생하여도 반드시 실행
		}
		
	}

	
}
