package ex03_api;

import java.util.Calendar;

public class Quiz02 {

	public static void main(String[] args) {

		Calendar anniversary = Calendar.getInstance();
		anniversary.set(2000, 0, 1); // 2000-01-01
		
		Calendar today = Calendar.getInstance();
		
		// 타임스탬프의 차이를 구합니다.
		long elapseTime = today.getTimeInMillis() - anniversary.getTimeInMillis();
		
		// 밀리초 -> 일(1000밀리초 * 60 * 60 * 24 = 1일)
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		
		System.out.println("경과한 일수는 "+elapseDay + "일입니다.");
		
	}

}
