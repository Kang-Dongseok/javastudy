package quiz05;

public class BankAccount {

	// field
	private String accNo;
	private long balance;
	
	// constructor
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// method
	public void deposit(long money) {
		if(money<=0) {
			System.out.println(money+"원은 입금할 수 없습니다.");
			return;
		}
		balance += money;
	}
	
	// 실제로 출금된 금액을 반환하는 메소드
	public long withdraw(long money) {	// long money : 요청금액
		if(money<=0) {
			System.out.println(money+"원은 출금할 수 없습니다.");
			return 0;
		}else if(balance<money) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}
		balance -= money;
		return money;
	}
	
	public void inquiry() {
		System.out.println("계좌번호: "+accNo+"("+balance+"원)");
	}
	
	public void transfer(BankAccount you,long money) {
//		if(money<=0) {
//			System.out.println(money+"원 이체 불가능합니다.");
//			return;
//		}else if(money>balance) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
		you.deposit(withdraw(money));
	}
}