package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성시 주민등록번호와 이름 전달
		Korean K1 = new Korean("123456-1234567", "감자바");
		
		//필드값 읽기
		System.out.println(K1.nation );
		System.out.println(K1.ssn);
		System.out.println("before: "+ K1.name);
		
		// 파이널 값은 변경 불가능
		// 파이널 값이 아닌 필드에서 선언된 값의 경우에는 후위에서 변경이 가능하다. 
	    K1.name = "김경진";
	    
	    System.out.println("after:  " + K1.name);
	}

}
