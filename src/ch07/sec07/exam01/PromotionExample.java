package ch07.sec07.exam01;

class A{}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends C{}


public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		System.out.println(a1.getClass().getSimpleName()); // B
        System.out.println(a2.getClass().getSimpleName()); // C
        System.out.println(a3.getClass().getSimpleName()); // D
        System.out.println(a4.getClass().getSimpleName()); // E
		
        if (a3 instanceof B) {
            System.out.println("a3를 B로 캐스팅 성공");
        }
		
		
		
		
//		B b1 = d;
//		C c1 = e;
//		
//		//B b3 = e;
//		//C c2 = d;
//		
	}

}
