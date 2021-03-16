package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 2개를 입력하세요");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double tmp = a;
		a = b;
		b = tmp;
		System.out.println("a: "+a+", b: "+b);
		
		sc.close();
	}

}
