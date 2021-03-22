package ex08_static;

public class KoreanMainClass {

	public static void main(String[] args) {
		
		// 인스턴 korean1
		Korean korean1 = new Korean();
		
		// 인스턴스 필드에 접근합니다. 인스턴스 korean1을 통해서 접근합니다.
		korean1.name = "홍길동";
		
		System.out.println(korean1.country); // 1)인스턴스로 접근
		System.out.println(Korean.country); // 2) 클래스로 접근
	}
}