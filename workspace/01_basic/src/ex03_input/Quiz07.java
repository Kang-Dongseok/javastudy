package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요");
		double weight = sc.nextDouble();
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		double bmi = weight/Math.pow(height,2);
		System.out.println("체질량지수= " + bmi);
		if(bmi>=25)
			System.out.println("과체중");
		else if(bmi>20)
			System.out.println("정상");
		else
			System.out.println("저체중");
		
		sc.close();
	}

}
