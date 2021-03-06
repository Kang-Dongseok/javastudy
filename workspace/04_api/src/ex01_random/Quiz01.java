package ex01_random;

// 1. 임시비밀번호 발급하기
// 영문대문자 + 아라비아숫자 6자리
// 약 5:5
public class Quiz01 {

	public static void main(String[] args) {

		char[] charSet = {
				'0', '1', '2', '3', '4', '5',
				'6', '7', '8', '9', 'A', 'B',
				'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N',
				'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z'
		};
		
		
		// 방법1.
		String pwd = "";
		for(int i = 0; i < 6; i++) {
			if(Math.random()<0.5) {
				pwd += charSet[(int)(Math.random() * 10)];
			}
			else {
				pwd += charSet[(int)(Math.random() * (charSet.length-10)) + 10];
			}
		}
		System.out.println(pwd);
		
		// 방법2.
		// 문자 == 정수
		// '0' ~ '9' == 48 ~ 57
		// 'A' ~ 'Z' == 65 ~ 90
		// 'a' ~ 'z' == 97 ~ 122
		
		String tempPw2 = "";
		for(int i = 0; i < 6; i++) {
			if(Math.random() < 0.5) {
				int arabia = (int)(Math.random() * 10) + '0';
				tempPw2 += (char)arabia;
			}
			else {
				int alphabet = (int)(Math.random() * 26) + 'A';
				tempPw2 += (char)alphabet;
			}
		}
		System.out.println(tempPw2);
		
		
	}

}
