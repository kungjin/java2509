package ch09.sec04.exam03;

public class A {

	public void method1(int arg) {
		int var = 1;

		class B {
			// 메소드
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);

				// 로컬 변수 수정
				// arg = 2;
				// var = 2;

			}

		}

		// 로컬 객체 생성
		B b = new B();
		// 로컬 객체 메소드 호출
		b.method2();

		// 로컬 변수 수정
		// arg = 3;
		// var = 3;

	}

}
