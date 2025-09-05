package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car 객체 생성
		Car myCar = new Car();
		
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재재속도: " + myCar.speed);
	}

}
