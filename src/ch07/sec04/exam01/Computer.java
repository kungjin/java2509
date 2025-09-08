package ch07.sec04.exam01;

public class Computer extends Calculator{
	//메소드 오버라이딩
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	
	// 메소드를 오버라이딩 할때에는 다음과 같은 규치겡 주의해서 작성해야한다.
	// 부모 메서드의 선언부(리턴 타입, 메소드 이름,매게변수)와 동일해야한다.
	//접근제한을 더 강하게 오버라이딩 할 수 없다(public ->private으로 변경 불가)
	//새로운 예외를 throws할수 없다(예외는 10장 학습한다.)
}
