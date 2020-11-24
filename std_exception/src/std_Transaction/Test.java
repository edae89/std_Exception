package std_Transaction;
	//트랜잭션 처리하기
	//ex)상품 발송
	//포장, 발송 두 단계를 하나의 작업(트랜잭션)으로 한다.
	//즉, 두 단계 중 하나라도 실패(예외 발생)하면 모두 취소하도록 한다.(Rollback)

public class Test {
	String a = "포장";
	String b = "발송";
	
	
	public void packing() throws Exception {
		System.out.println(a+" 완료");
	}
	
	public void sending() throws Exception{
		System.out.println(b+" 완료");
	}
	
	public void allCancel() {
		System.out.println("모두 취소");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		try {
			t.packing();
			t.sending();
		}catch(Exception e){
			t.allCancel();
		}
		
		
	}

}
