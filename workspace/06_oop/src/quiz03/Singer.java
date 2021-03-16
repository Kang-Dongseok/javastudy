package quiz03;

public class Singer {

	// field
	private String name;
	private Song song; // private Song[] songs;
	
	public Singer() {}
	public String getName() {
		return name;
	}
	
	//metho
	
	public void setName(String name) {
		this.name = name;
	}
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
	public Singer(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println(name);
		song.info();
	}
}
