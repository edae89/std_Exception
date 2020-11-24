package std_Exception;

public class TestSolution {

	public void sayNick(String nick) {
		
		try {
			if("fool".contentEquals(nick)) {
				throw new FoolException();		//Exception 발생(Checked Exception)
			}
			System.out.println("별명: "+nick);
			
		}catch(FoolException e){
			System.out.println("Exception발생");	//예외 처리
		}
		
	}
	
	public static void main(String[] args) {
		TestSolution t = new TestSolution();
		t.sayNick("fool");
		t.sayNick("genious");
		
	}

}
