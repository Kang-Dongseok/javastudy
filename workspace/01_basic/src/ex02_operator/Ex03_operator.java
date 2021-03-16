package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {

		// 6. 조건 연산자 (삼항 연산자)
		// 조건식 ? true일 때 : false일 때
		
		int score = 70;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		// 문제1. 평균이 85점 이상이거나, 국어와 영어 점수가 모두 80점 이상이면 "합격", 아니면 "불합격"
		int kor = 80;
		int eng = 90;
		String pass2 = (kor+eng)/2 >= 85 || (kor >= 80 && eng >= 80) ? "합격" : "불합격";
		System.out.println(pass2);
		
		// 문제2. 2자리(10~99) 정수 중에서 하나를 임의로 선어하고,
		// 그 값이 '카프리카 수'이면 "맞다", 아니면 "아니다"
		// 45, 55, 99가 카프리카 수 입니다.
		int n = 99; // 45 * 45-> 2025 -> 20 25 -> 20 + 25 -> 자신
		String pass3 = (n*n/100) + (n*n%100) == n ? "맞다" : "아니다";
		System.out.println(pass3);
	}

}
