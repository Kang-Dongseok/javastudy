package ex03_api;

import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {

		// java.util.Calndar
		// 1. 자바에서 날짜와 시간을 처리하는 주요 클래스입니다.
		// 2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있습니다.
		
		// 현재 날짜와 시간 생성
		Calendar date = Calendar.getInstance();
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1; // Calendar.MONTH: 0 ~ 11
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo = date.get(Calendar.DAY_OF_WEEK); // 요일번호(일:1, 월:2, ..., 토:7)
		String[] WeekNames = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println(year + "-"+month+"-"+day+" "+WeekNames[weekNo]+"요일");
		
		int ampm = date.get(Calendar.AM_PM); // 오전:0, 오후:1
		int hour = date.get(Calendar.HOUR); // 0 ~ 11
		int hour2 = date.get(Calendar.HOUR_OF_DAY); // 0 ~ 23
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis= date.get(Calendar.MILLISECOND);
		System.out.println((ampm==0?"오전":"오후")+" "+hour+":"+minute+":"+second+"."+millis);

		// 날짜 변경하기
		date.set(1990, 10, 10, 9, 30, 40); // 날짜: 1990년 11월 10일 9시 30분 40초
		System.out.println(date);
		
	}

}
