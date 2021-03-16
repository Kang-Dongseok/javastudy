package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		char point='-';
		switch(n%10) {
		case 4:
		case 5:
		case 6:
			point = '0';
			break;
		case 7:
		case 8:
		case 9:
			point = '+';
		}
		
		char grade = 'F';
		switch(n/10) {
		case 10:
			grade = 'S';
			point = ' ';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			point = ' ';
		}
		System.out.println(""+grade+point);
		System.out.println(grade+""+point);
		System.out.println(grade+point+"");
		sc.close();
	}

}
