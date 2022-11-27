package ch6;

public class Ch6_3 {
    public static void main(String[] args) {
        // 문제 6-1에서 정의한 Student클래스에 다음과 같이 정의된
        // 두 개의 메서드 getTotal()과 getAverage()을 추가하시오

        // 메서드명 : getTotal
        // 기능 : 국어, 영어, 수학의 점수를 모두 더해서 반환한다
        // 반환타입 : int
        // 매개변수 : 없음

        // 메서드명 : getAverage
        // 기능 : 총점(국어+영어+수학)을 과목수로 나눈 평균을 구한다
        //          소수점 둘째자리에서 반올림 할 것
        // 반환타입 : float
        // 매개변수 : 없음

        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평군: " + s.getAverage());
    }
}

class Student {
    String name;    // 학생이름
    int ban;        // 반
    int no;         // 번호
    int kor;        // 국어점수
    int eng;        // 영어점수
    int math;       // 수학점수

    Student() {
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) (getTotal() / 3.0 * 10 + 0.5) / 10f;
    }

    String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math
                + ", " + getTotal() // 총합
                + ", " + getAverage();    // 평균
    }
}
