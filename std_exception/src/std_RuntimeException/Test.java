package std_RuntimeException;
//RuntimeException 발생시키기
public class Test {
	
	public void sayNick(String nick) {
		
		if("fool".contentEquals(nick)) {
			throw new FoolException();		// RuntimeException(Unchecked Exception), 실행 시 발생하는 예외->발생할 수도 있고 안 할 수도 있는 경우 사용
		}
		System.out.println("별명: "+nick);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.sayNick("fool");
		t.sayNick("genious");
		
	}

}
