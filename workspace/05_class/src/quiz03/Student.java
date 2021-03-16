package quiz03;

public class Student {

	String name;
	int kor;
	int eng;
	int math;
	
	void set(String n, int a, int b, int c) {
		name = n;
		kor = a;
		eng = b;
		math = c;
	}
	
	double getAverage() {
		return (kor+eng+math)/3.0;
	}
	
	String getPass() {
		return this.getAverage() >= 60 ? "합격" : "불합격";
	}
//	System.arraycopy()
}
