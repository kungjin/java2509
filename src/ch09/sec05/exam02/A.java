package ch09.sec05.exam02;

public class A {

	//A 인스턴스 필드
	
	String field = "A-field";
	
	//A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 맴버 클랫스
	class B{
		//B인스턴스 필드
		String field  = "B-field";
		
		//B인스턴스 메소드 
		void method() {
			System.out.println("B-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
}
	//A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
