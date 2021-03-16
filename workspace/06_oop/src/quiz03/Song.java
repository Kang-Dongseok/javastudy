package quiz03;

public class Song {

	// field
	private String title;
	private double playTime;
	
	// constructor
	public Song() {}
	public Song(String title, double playTime) {
		this.title = title;
		this.playTime = playTime;
	}
	// method
	public void info() {
		System.out.println("("+title+", "+playTime+")");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPlayTime() {
		return playTime;
	}
	public void setPlayTime(double playTime) {
		this.playTime = playTime;
	}
}