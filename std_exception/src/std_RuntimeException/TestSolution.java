package std_RuntimeException;

public class TestSolution {
	
	public void sayNick(String nick) {
		try {
			if("fool".contentEquals(nick)) {
				throw new FoolException();		// RuntimeException 발생(Unchecked Exception)
			}
			System.out.println("별명: "+nick);
			
		}catch(FoolException e){
			System.out.println("RuntimeException발생");
		}
	}
	
	public static void main(String[] args) {
		TestSolution t = new TestSolution();
		t.sayNick("fool");
		t.sayNick("genious");
		
	}

}
