package std_Exception;
//Exception 발생시키기, 컴파일 에러 발생

public class Test {

	public void sayNick(String nick) {
		
		if("fool".contentEquals(nick)) {
			throw new FoolException();		//Exception(Checked Exception), 프로그램 작성 시 이미 예측 가능한 경우 사용->컴파일 오류 발생
		}
		System.out.println("별명: "+nick);
		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.sayNick("fool");
		t.sayNick("genious");
		
	}

}
