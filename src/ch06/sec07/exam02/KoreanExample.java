package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean K1 = new Korean("박자바", "011255-1234567");

		System.out.println("K1.nation : " + K1.nation);
		System.out.println("K1.name : " + K1.name);
		System.out.println("K1.ssn : " + K1.ssn);
		System.out.println();

		Korean K2 = new Korean("이자바", "930525-0654231");

		System.out.println("K2.nation : " + K2.nation);
		System.out.println("K2.name : " + K2.name);
		System.out.println("K2.ssn : " + K2.ssn);
	}

}
