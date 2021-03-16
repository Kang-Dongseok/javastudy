package ex01_array;

import java.util.Scanner;

// 평균, 최대, 최소 점수를 출력하기

public class Quiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] students = {"타요", "브레드", "스폰지밥"};
		int[] scores = new int[students.length];

		for(int i = 0; i < scores.length; i++) {
			System.out.print(students[i]+"의 점수 >>>");
			scores[i] = sc.nextInt();
		}
		
		int max=scores[0];
		String top = students[0];
		int min=scores[0];
		String bottom = students[0];
		int sum=scores[0];
		
		for(int i = 1; i < scores.length; i++) {
			if(scores[i]>max) {
				max=scores[i];
				top = students[i];
			}
			if(scores[i]<min) {
				min=scores[i];
				bottom = students[i];
			}
			sum += scores[i];
		}
		double ave = ((double)sum/scores.length);

		System.out.println("최대값= "+max+"("+top+")");
		System.out.println("최솟값= "+min+"("+bottom+")");
		System.out.println("평균값= "+ave);
		
		sc.close();
	}

}
