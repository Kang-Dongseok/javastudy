package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println(age>19?"성인":"미성년자");
		
		sc.close();
	}

}
