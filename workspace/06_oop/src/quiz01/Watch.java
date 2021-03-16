package quiz01;

public class Watch {

	private int hour;
	private int minute;
	private int second;
	
	Watch(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	Watch(){
		
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void addHour(int hour) {
		this.hour += hour;
		this.hour %= 24;
	}

	public void addMinute(int minute) {
		this.minute += minute;
		addHour(this.minute/60);
		this.minute %= 60;
	}
	
	public void addSecond(int second) {
		this.second += second;
		addMinute(this.second/60);
		this.second %= 60;
	}
	
	public void see() {
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
	}
}
