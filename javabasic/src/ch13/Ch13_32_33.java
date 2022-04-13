package ch13;

public class Ch13_32_33 {

	public static void main(String[] args) {

		Runnable r = new RunnableEx13();
		new Thread(r).start();
		new Thread(r).start();
		
	}

}

class Account2 {
	private int balance = 1000; // private으로 해야 동기화가 의미가 있다.

	// 읽어올때도 동기화를 해주는것이 좋다!
	public synchronized int getBalance() {
		return balance;
	}

	// synchronized로 메서드를 동기화
	//	-> 잔고가 음수로 떨어지지 않는다
	public synchronized void withdraw(int money){ 
//		System.out.println("시작전 "+balance);
		if(balance >= money) {
			try { Thread.sleep(100);} catch(InterruptedException e) {}
			balance -= money;
		}
	} // withdraw
}

class RunnableEx13 implements Runnable {
	Account2 acc = new Account2();

	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance:"+acc.getBalance());
		}
	} // run()
}