package ex02_loop;

import java.util.Scanner;

// 2. 영화 평점을 입력받아서 ★을 출력
// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("평점 >>>");
			int n = sc.nextInt();
			if(n>=1&&n<=5) {
				for(int i = 0 ; i < n ; i++) {
					System.out.print("★");
				}
				break;
			}
			else {
				System.out.println("다시 입력");
			}
		}
		
	}

}
