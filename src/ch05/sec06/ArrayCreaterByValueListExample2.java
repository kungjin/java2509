package ch05.sec06;

public class ArrayCreaterByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 변수 선언
		int[] scores;

		// 배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };
		
		// 배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for (int i = 0; i < 2; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 :" + sum1);

		// 배열을 매개값으로 주고 printItem()메소드 호출
		printItem(new int[] { 83, 90, 87 });
	}

	    // printItem() 메소드 선언
	    public static void printItem(int[] scores) {
		for (int i = 0; i < 3; i++) {
			System.out.println("score["+ i +"]:" + scores[i]);
		}
	}

}
