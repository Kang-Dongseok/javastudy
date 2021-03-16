package ex01_array;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arr = new String[3];
		for(int i = 0; i < arr.length ;i++) {
			System.out.print((i+1)+"번째 이름 입력 >>>");
			arr[i] = sc.next();
		}
		for(String name : arr) {
			System.out.println(name);
		}
		sc.close();
	}

}
