package ch12.sec04;

public class ExitExample {

	public static void main(String[] args) {

		for(int i =0; i<10; i++) {
			//i 값출력
			System.out.println(i);
			if(i == 5) {
				//JVM 프로세스 종료 
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}

	}

}



//exit() 메소드는 int 매개값이 필요한데, 이 값을 종료 상태값이라고 한다. 종료 상태값으로 어떤 값을 주더라고 프로세스는 
//종료되는데 정상 종료일 경우(), 비정상 종료는 1또는 -1로 주는 섯이 관례이다.
