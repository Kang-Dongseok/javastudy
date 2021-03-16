package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
	/*
		'1' % 2 -->
		------
		알아두면 좋은 코드 값
		'0' : 48
		'A' : 65
		'a' : 97
	 */
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호(하이픈 없이)를 입력하세요");
		char id = sc.nextLine().charAt(6);
		if(id=='1'||id=='3')
			System.out.println("남");
		else
			System.out.println("여");
		
		sc.close();
	}

}
