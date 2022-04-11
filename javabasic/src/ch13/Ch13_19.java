package ch13;

public class Ch13_19 {

	public static void main(String[] args) {

		// 쓰레드의 상태
		// 1. NEW
		//	-> 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
		// 2. RUNNABLE
		//	-> 실행 중 또는 실행 가능한 상태
		// 3. BLOCKED
		//	-> 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
		// 4. WAITING, TIMED_WATING
		//	-> 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 
		//		일시정지 상태. TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
		// 5. TEMINATED
		//	-> 쓰레드의 작업이 종료된 상태
		
		// 대기
		// suspend()
		// sleep()
		// wait()
		// join()
		// I/O block
		
		// 재개
		// time-out
		// resume()
		// notify()
		// interrupt()
	}

}
