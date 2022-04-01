package ch11;

import java.util.*;

public class Ch11_37_38 {

	public static void main(String[] args) {

		// HashSet
		// -> 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
		// -> Set은 중복을 허용하지 않기 때문
		// -> 같은 객체가 없으면 저장, 있으면 저장하지 않는다
		// -> boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
		// -> equals()와 hashCode()가 오버라이딩 되어 있어야 함

		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));

		System.out.println(set);

		System.out.println("---------------");

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A = " + setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B = " + setB);

		// 교집합
		Iterator it = setB.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (setA.contains(tmp))
				setKyo.add(tmp);
		}

		// 차집합
		it = setA.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (!setB.contains(tmp))
				setCha.add(tmp);
		}

		// 합집합
		it = setA.iterator();
		while (it.hasNext())
			setHab.add(it.next());

		it = setB.iterator();
		while (it.hasNext())
			setHab.add(it.next());

		// 교집합
//		setA.retainAll(setB);
//		System.out.println(setA);
		// 차집합
//		setA.removeAll(setB);
//		System.out.println(setA);
		// 합집합
//		setA.addAll(setB);
//		System.out.println(setA);
		
		
		System.out.println("A ∩ B = " + setKyo); 
		System.out.println("A U B = " + setHab); 
		System.out.println("A - B = " + setCha);

	}

}

// equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작!
//	-> 소스에서 선택해서 자동으로 만들어주고 수정하면 빠르다!
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
		if (!(obj instanceof Person))
			return false;

		Person p = (Person) obj;

		return this.name.equals(p.name) && this.age == p.age;
	}
}
