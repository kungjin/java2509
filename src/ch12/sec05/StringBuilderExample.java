package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
			.insert(0, "ABC")
			.delete(3, 4)
			.toString();
		System.out.println(data);
	}

}
// StringBuilder append(기본값 | 문자열)            문자열 끝에 추가 
// StringBuilder insert(위치, 기본값 | 문자열)       문자열 지정 위치에 추가
// StringBuilder delete(시작위치, 끝위치)            문자열 일부를 삭제
// StringBuilder replace(시작위치, 끝위치, 문자열)    문자열 일부를 대체
// String        toString()                      완성된 문자열 리턴