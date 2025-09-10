package ch09.sec02.exam02;

public class A {
	 //ㅇ;ㄴㅅ,탄ㅅ, 멤바 ㅋ,ㄹ렛,
	class B {
		int field1 = 1;
		
		//정적 필드(Jave17부터 허용)
		static int field2 = 2;
		
		//생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		
		//인스턴스 메소드 
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		//정적 메소드 (Java 17부터 허용)
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}
	
	//인스턴스 메소드 
	void useB() {
		//B 객체 생성 및 인스턴스 필드 및 메소드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(B.field2);
		B.method2();
	}
}
