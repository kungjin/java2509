package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//모든 사람이 신청 가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
	System.out.println();
	
	//학생만 신청 가능 
	Course.registerCourse2(new Applicant<Student>(new Student()));
	Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
	Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
System.out.println();

//직장인 및 일반이만 신청 가능
Course.registerCourse3(new Applicant<Person>(new Person()));
Course.registerCourse3(new Applicant<Worker>(new Worker()));


	}

}

//상속 구조가 맞아야 제네릭 제한이 올바르게 동작한다.
//HighStudent와 MiddleStudent는 반드시 Student의 하위 클래스여야 <? extends Student> 조건 충족.
//
//와일드카드 사용 이유
//<?>          → 모든 타입 허용
//<? extends T> → 특정 타입 이하로 제한
//<? super T>   → 특정 타입 이상으로 제한
//
//코드 재사용성 + 타입 안정성
//제네릭 와일드카드를 활용하면 “누구 가능 / 누구만 가능 / 누구 불가능” 같은 조건을 깔끔하게 표현할 수 있다.

