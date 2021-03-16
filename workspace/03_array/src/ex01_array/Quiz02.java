package ex01_array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] friendList = {"타요", "짱구", "스폰지밥"};
		System.out.print("새로사귄 친구의 수 >>>");
		int n = sc.nextInt();
		String[] friendListNew = new String[n+friendList.length];
		for(int i = 0; i < friendList.length ;i++) {
			friendListNew[i] = friendList[i];
		}
		
		// 새 친구들을 입력 받습니다.
		for(int i = friendList.length; i < friendListNew.length ;i++) {
			System.out.print("새 친구 이름 >>>");
			friendListNew[i] = sc.next();
		}
		
		// 새로운 배열로 갈아탑니다.
		friendList = friendListNew;
		
		// 확인해봅시다.
		for(String friend : friendList) {
			System.out.println(friend);
		}
		sc.close();
	}

}
