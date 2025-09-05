package ch06.sec07.exam01;

public class Car {
    String model;
    String color;
    int maxSpeed;
// 생성자 선언
	
	Car(String model, String color, int maxSpeed) {
	
		this.model = model;       // 매개변수 값을 필드에 대입
        this.color = color;
        this.maxSpeed = maxSpeed;
	}
	
}
