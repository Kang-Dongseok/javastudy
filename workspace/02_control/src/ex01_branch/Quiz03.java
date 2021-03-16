package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		switch(age / 10) {
		case 0:
		case 1:
			System.out.println("미성년자");
			break;
		default:
			System.out.println("성인");
		}
		
		sc.close();
	}

}
