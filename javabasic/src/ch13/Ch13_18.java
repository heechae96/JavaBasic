package ch13;

class Ch13_18 implements Runnable  {
	static boolean autoSave = false;

	public static void main(String[] args) {

		// 데몬 쓰레드(daemon thread)
		//	-> 일반 쓰레드(non-daemon thread)의 작업을 돕는 보조적인 역할을 수행
		//	-> 일반 쓰레드가 모두 종료되면 자동적으로 종료된다
		//	-> 가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용된다
		//	-> 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면
		//		작업을 수행하고 다시 대기하도록 작성한다
		
		// 쓰레드가 데몬 쓰레드인지 확인한다.
		//	-> boolean isDaemon()
		
		// 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경
		//	매개변수on을 true로 지정하면 데몬 쓰레드가 된다
		//	-> void setDaemon(boolean on)
		
		// setDaemon(boolean on)은 반드시 start()를 호출하기 전에 실행되어야 한다
		//	그렇지 않으면 illegalThreadStateException이 발생한다
		
		Thread t = new Thread(new Ch13_18());
		t.setDaemon(true);		// 이 부분이 없으면 종료되지 않는다.
		t.start();

		for(int i=1; i <= 10; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);

			if(i==5) autoSave = true;
		}

		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		while(true) {
			try { 
				Thread.sleep(3 * 1000); // 3초마다
			} catch(InterruptedException e) {}

			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave) autoSave();
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}