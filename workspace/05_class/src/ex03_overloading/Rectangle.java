package ex03_overloading;

/*
	오버로딩(overloading)
	1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미합니다.
	2. 결과타입은 오버로딩과 상관이 없습니다.
 */
public class Rectangle {

	// field
	int width; // 너비
	int height; // 높이
	
	void set(int n) {
		set(n, n);
	}
	
	void set(int w, int h) {
		if(w>0) {
			width = w;
		}
		if(h>0) {
			height = h;
		}
	}
	int getArea() {
		return width * height;
	}
}
