package ch07;

public class Ch07_33 {

	public static void main(String[] args) {

		// 추상클래스의 작성
		//	-> 미완성 설계도(미완성 메소드 포함)
		// 	-> 여러 클래스에 공통적으로 사용 될수 있는 추상클래스를 바로
		// 작성하거나 기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다
		
		// 객체 배열?
		//	-> 참조변수 묶음
		
		/*
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		*/
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		/*
		group[0].move(100, 200);
		group[1].move(100, 200);
		group[2].move(100, 200);
		*/
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);			
		}
		
	}

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit { 
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() {  }
}

class Tank extends Unit { 
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() {  }
}

class Dropship extends Unit { 
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   {  }
	void unload() {  }
}