package ex02_String;

import java.util.Scanner;

// 1. 시간을 입력 받아서 출력하기
// 시간 >>> 9
// 분 >>> 5
// 초 >>> 30
// 9:05:30 입니다.

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		System.out.print("시간 >>> "); hour = sc.nextInt();
		System.out.print("분 >>> "); minute = sc.nextInt();
		System.out.print("초 >>> "); second = sc.nextInt();
		System.out.printf("%d:%02d:%02d",hour,minute,second);
//		System.out.printf(hour+":"+minute+":"+second+);
		
	}

}
