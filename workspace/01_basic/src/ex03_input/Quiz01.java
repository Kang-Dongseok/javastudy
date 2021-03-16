package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("int 타입의 점수 3개를 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		double average = (n1+n2+n3)/3.0;
		System.out.println("평균: " +average);

		sc.close();
	}

}
