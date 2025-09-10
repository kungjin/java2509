package ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구현 객체 생성 
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//인터페이스 변수 선언 
		A a;
		
		//변수에 구현 객체 대입 (자동 타입 변환) 
		a = b;
		a = c;
		a = d;
		a = e; 
		
		
		a = new B();
		System.out.println(a.getClass().getSimpleName()); // B

		a = new D();
		System.out.println(a.getClass().getSimpleName()); // D
		
		
	}

}
