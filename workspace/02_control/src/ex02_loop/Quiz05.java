package ex02_loop;

// 현재 10000원이 있습니다.

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = 10000;
		
		while(true) {
			System.out.println("현재 "+money+"원이 있습니다.");
			if(money==0) {
				break;
			}
			System.out.print("결제금액 >>> ");
			int pay = sc.nextInt();
			if(pay<=0) {
				System.out.println(pay+"원은 결제할 수 없습니다.");
			}
			else if(pay>money) {
				System.out.println(pay-money+"원이 부족합니다.");
			}
			else {
				money -= pay;
			}
		}
		sc.close();
	}

}
