package ex01_random;

import java.util.Scanner;

// 2. UpDown게임
// 1 ~ 10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞히는 게임
// 입력 >>> 5000
// Up
// 입력 >>> 7500
// Down
// 입력 >>> 7499
// 총 3번만에 정답입니다.

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int top = 10000;
		int bottom = 1;
		int rand = (int)(Math.random() * top) + bottom; // 난수 발생
		int n = 0; // 사용자 입력 값
		int times = 0; // 입력 횟수
		
		while(true) {
			System.out.println("입력 >>> ");
			n = sc.nextInt();
			times++;
			if(n>top || n<bottom) {
				System.out.println(bottom + "~" + top + "범위를 입력하세요.");
				continue;
			}
			if(n>rand) {
				System.out.println("Down");
				top = n-1;
			}else if(n<rand) {
				System.out.println("Up");
				bottom = n+1;
			}else {
				System.out.println("총" + times + "번만에 정답입니다.");
				break;
			}
		}
		sc.close();
	}

}
