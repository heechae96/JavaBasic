package ch13;

public class Ch13_9_10 {

	static long startTime = 0;

	public static void main(String[] args) {

		// 싱글스레드와 멀티스레드
		//	-> 멀티스레드가 시간이 좀 더 걸린다
		//		-> 시간이 좀 더 걸리더라도 한번에 2가지 작업이 가능한게 장점!
		
		System.out.println("싱글스레드");
		
		long startTime = System.currentTimeMillis();

		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("-"));		

		System.out.print("소요시간1:" +(System.currentTimeMillis()- startTime)); 

		for(int i=0; i < 300; i++) 
			System.out.printf("%s", new String("|"));		

 		System.out.print("소요시간2:"+(System.currentTimeMillis() - startTime));
 		
 		System.out.println("\n멀티스레드");
 		
 		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		startTime = System.currentTimeMillis();

		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("-"));	

		System.out.print("소요시간1:" + (System.currentTimeMillis() - Ch13_9_10.startTime));
 		
	}

}

class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++)
			System.out.printf("%s", new String("|"));	

		System.out.print("소요시간2:" + (System.currentTimeMillis() - Ch13_9_10.startTime));
	}
}