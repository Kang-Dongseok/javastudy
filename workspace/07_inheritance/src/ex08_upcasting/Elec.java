package ex08_upcasting;

public class Elec {

	// field
	private int watt; // 소비전력

	// constructor
	public Elec(int watt) {
		super();
		this.watt = watt;
	} 

	// method
	public void info() {
		System.out.println("소비전력 : "+ watt + "W");
	}
}
