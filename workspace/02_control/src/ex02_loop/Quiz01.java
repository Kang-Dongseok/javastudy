package ex02_loop;

import java.util.Scanner;

// 1. 퀴즈 맞히기
// 맞힐때까지 계속 물어보는 퀴즈입니다.
// 대한민국의 수도는? >>> 서울 또는 seoul

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String city = "";
//		String city = null;
		while(true) {
			System.out.println("대한민국의 수도는? >>>");
			String capital = sc.next();
			if(capital.equals("서울")||capital.equalsIgnoreCase("seoul")) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("오답입니다.");
			}
		}
	}
}
