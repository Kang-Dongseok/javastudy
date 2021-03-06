package ex02_2d_array;

// 3. (1 ~ 99 사이 정수 대상) 369 결과 저장하고 출력하기
// 1 2 짝 4 5 짝 7 8 짝 10
// 11 12 짝 14 15 짝 17 18 짝 20
// 21 22 짝 24 25 짝 27 28 짝 짝
// 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40
// ...
public class Quiz03 {

	public static void main(String[] args) {

		String[][] arr = new String[10][10];
		
		int n = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(n/10==3||n/10==6||n/10==9) {
					arr[i][j] = "짝";
					if(n%10==3||n%10==6||n%10==9) {
						arr[i][j] += "짝";
					}
				}
				else if(n%10==3||n%10==6||n%10==9) {
					arr[i][j] = "짝";
				}
				else {
					arr[i][j] = ""+n;
				}
				System.out.print(arr[i][j] + "\t");
				n++;
			}
			System.out.println();
		}
	}
}
