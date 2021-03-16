package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("매출액을 입력하세요");
		int salesMoney = sc.nextInt();
		System.out.println("등급을 입력하세요");
		String grade = sc.next();
		System.out.println(grade.equalsIgnoreCase("VIP")?"실 매출액: "+0.8*salesMoney:"실 매출액: "+0.95*salesMoney);
		
		sc.close();
	}

}
