package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n%3==0){
			System.out.println("3의 배수");
		}
		else if(n%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		sc.close();
		
	}

}
