package ch09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A 객체 생성 
		A a = new A();
		a.field.hello();
		
		//B 객체 생성
		A.B b = a.new B();
		
		b.hello();
		System.out.println("ok");
	}

}
