package ex17_Object.quiz;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Score {

	// field
	private int kor, eng, mat;
	
	// constructor
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// method
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Score) {
			Score s = (Score)obj;
			return (kor == s.kor && eng == s.eng && mat == s.mat);
		}
		return false;
	}

	@Override
	public String toString() {
		return "[국어: "+kor+", 영어: "+eng+", 수학: "+mat+"]";
	}
}
