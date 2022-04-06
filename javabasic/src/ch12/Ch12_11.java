package ch12;

public class Ch12_11 {

	public static void main(String[] args) {
		
		// 제네릭스의 제약
		//	-> 타입 변수에 대입은 인스턴스 별로 다르게 가능
		// Box<Apple> appleBox = new Box<Apple>();
		// Box<Grape> grapeBox = new Box<Grape>();
		
		//	-> static멤버에 타입 변수 사용 불가
		//		-> 모든 인스턴스에 공통!
//		class Box<T>{
//			static T item;	// 에러
//			static int compare(T t1, T t2) {};	// 에러
//		}
		
		// 배열 생성할 때 타입 변수 사용불가. 타입 변수로 배열 선언은 가능
		//	-> 객체 생성할 때도 마찬가지
		//	-> new T가 안된다!
//		class Box<T>{
//			T[] itemArr;	// ok.
//			T[] toArray() {
//				T[] tmpArr = new T[itemArr.length];	// 에러. 제네릭 배열 생성불가
//			}
//		}
	}

}
