package quiz04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data	// getter, setter, noArgsConstructor, toString, equals, hashCode
@AllArgsConstructor
public class Book {
	
	// field
	private int bNo;
	private String bTitle;
	private String bWriter;

}
