package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 의미하는 숫자(1~4)를 입력하세요");
		int num = sc.nextInt();
		if(num==1||num==3)
			System.out.println("남");
		else
			System.out.println("여");
		
		sc.close();
	}

}
