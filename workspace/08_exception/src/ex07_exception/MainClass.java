package ex07_exception;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("9999", 10000);
		
		me.transfer(you, 50000);
		
		me.inquiry();
		you.inquiry();
		
	}
}
