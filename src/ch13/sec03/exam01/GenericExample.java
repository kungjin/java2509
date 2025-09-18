package ch13.sec03.exam01;

public class GenericExample {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
		

	}

}

//이 코드는 제네릭(Box<T>)을 활용해 Integer와 String 타입 데이터를 타입 안정성 있게 저장하고 꺼내며, 
//boxing() 제네릭 메소드를 통해 어떤 타입이든 Box에 담아 반환할 수 있음을 보여주는 예제다.