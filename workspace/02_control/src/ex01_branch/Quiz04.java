package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.print("기");
		case 2:
			System.out.print("승");
		case 3:
			System.out.print("전");
		case 4:
			System.out.print("결");
			break;
		default:
			System.out.print("알 수 없음");
		}
		
		sc.close();
	}

}
