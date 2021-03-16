package ex01_branch;

public class Ex02_switch {

	public static void main(String[] args) {

		int choice = 1;
		switch(choice) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("1과 2가 아니다.");
			break; // 없어도 어차피 switch문 끝나기 때문에 default에는 break 넣지 않는걸 추천
		}
			
	}

}
