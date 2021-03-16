package quiz02;

public class Coord {

	private int x;
	private int y;
	
	public Coord(){}
	public Coord(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void info() {
		System.out.print("["+x+", "+y+"]");
	}
}
