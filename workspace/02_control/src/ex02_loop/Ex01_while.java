package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		/*
		// 무한루프 만들기
		while(true) {
			System.out.println("무한루프입니다.");
		}
		*/
		/*
		// 10 ~1 출력
		int n = 10;
		while(n>=1) {
			System.out.println(n--);
		}
		*/
		
		// 'A' ~ 'Z' 사이를 계속 입력받는 프로그램
		//
		Scanner sc = new Scanner(System.in);
		/*
		char ch = 'A';
		
		while(ch >= 'A' && ch <= 'Z') { // while(ch >= 65 &&b ch <= 90){
			System.out.println("대문자 입력 >>>");
			ch = sc.next().charAt(0);
		}
		*/
		// 입력 받은 정수를 모두 더해줍니다.
		// 0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		int num = 0;
		int sum = 0;
		while(true) {
			System.out.println("정수 입력 >>>");
			num = sc.nextInt();
			if(num>=0)
				sum += num;
			else
				break;
		}
		System.out.println(sum);
		sc.close();
	}

}
