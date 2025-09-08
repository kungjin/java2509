package ch07.sec07.exam03;

public class childExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체  생성 및 자동타입 변환 
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3();
		
		
		Child child =(Child) parent;
		
		//Child 타입으로 필드와 메소드 사용 
		child.field2 = "data2";
		child.method3();
				
	}

}
