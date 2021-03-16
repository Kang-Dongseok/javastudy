package ex01_branch;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<1||age>100) {
			System.out.println("불가능한 나이");
		}
		else if(age<=7){
			System.out.println("미취학아동");
		}
		else if(age<=13){
			System.out.println("초등학생");
		}
		else if(age<=16){
			System.out.println("중학생");
		}
		else if(age<=19){
			System.out.println("고등학생");
		}
		else {
			System.out.println("성인");
		}
		
		sc.close();
	}

}
