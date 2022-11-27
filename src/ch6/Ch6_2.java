//package ch6;
//
//public class Ch6_2 {
//    // 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info를 추가하시오
//    public static void main(String[] args) {
//        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
//
//        String str = s.info();
//        System.out.println(str);
//    }
//}
//
//class Student {
//    String name;    // 학생이름
//    int ban;        // 반
//    int no;         // 번호
//    int kor;        // 국어점수
//    int eng;        // 영어점수
//    int math;       // 수학점수
//
//    Student(String name, int ban, int no, int kor, int eng, int math) {
//        this.name = name;
//        this.ban = ban;
//        this.no = no;
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
//
//    String info() {
//        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math
//                + ", " + (kor + eng + math) // 총합
//                + ", " + (int) ((kor + eng + math) / 3.0 * 10 + 0.5) / 10.0;    // 평균
//    }
//}
