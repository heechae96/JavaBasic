package ch14;

@FunctionalInterface
interface MyFunction {
	void run(); // public abstract void run();
}

public class Ch14_6 {

	static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}

	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		
		// 한 줄로!
		return () -> System.out.println("f3.run()");
	}

	public static void main(String[] args) {

		// 람다식으로 MyFunction의 run()을 구현
		// 함수형 인터페이스의 매개변수와 반환타입이 맞아야한다!
		MyFunction f1 = () -> System.out.println("f1.run()");

		// 함수형 인터페이스를 직접구현
		MyFunction f2 = new MyFunction() { // 익명클래스로 run()을 구현
			public void run() { // public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};

		MyFunction f3 = getMyFunction();

		f1.run();
		f2.run();
		f3.run();

		// 람다식을 매개변수로 받아서 호출
		execute(f1);
		execute(() -> System.out.println("run()"));
	}

}
