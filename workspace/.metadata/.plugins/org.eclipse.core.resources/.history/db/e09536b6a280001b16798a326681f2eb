package ex02_2d_array;

// 2. 구구단의 결과만 2차원 배열에 저장하고 출력하기
// 2 4 6 ... 18
// 3 6 9 ... 27
// ...
// 9 18 27 ... 81

public class Quiz02 {

	public static void main(String[] args) {

		int[][] arr = new int[8][9];
		for(int i = 2; i<=9;i++) {
			for(int j = 1; j<=9;j++) {
				arr[i-2][j-1] = i*j;
			}
		}
//		for(int i = 0; i<arr.length;i++) {
//			for(int j = 0; j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		for(int[] a : arr) {
			for(int n : a) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
	}

}
