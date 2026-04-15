package src.week2.oop;

public class Student {
    // 필드

    String name;
    int sutdentID;
    int age;
    double gpa;

    // 생성자1(모든 정보 받기)
    public Student(String name, int studentId, int age, double gpa) {
        this.name = name;
        this.sutdentID = studentId;

        // 나이 유혀성 검사
        if (age < 15 | age > 100) {
            this.age = 18;
            System.out.println("잘못된 나이를 입력했습니다.");

        } else {
            this.age = age;
        }

        // gpa 유효성 검사
        if (gpa < 0.0 | gpa > 4.0) {
            this.gpa = 0.0;
            System.out.println("잘못된 gpa를 입력했습니다.");
        } else {
            this.gpa = gpa;
        }
    }

    // 생성자2(이름, 학번만 받기)
    public Student(String name, int sutdentID) {
        this.name = name;
        this.sutdentID = sutdentID;
        this.age = 18;
        this.gpa = 0.0;
    }

    // 정보 수정 메서드
    // 나이수정
    public void updateAge(int newAge) {
        // 나이 유효성 검사
        if (newAge < 15 | newAge > 100) {
            age = newAge;
            System.out.println("잘못된 나이를 입력했습니다.");

        } else {
            age = newAge;
        }
    }

    // gpa 수정
    public void updateGpa(double newGpa) {
        // gpa 유효성 검사
        if (newGpa < 0.0 | newGpa > 4.0) {
            gpa = newGpa;
            System.out.println("잘못된 gpa를 입력했습니다.");
        } else {
            gpa = newGpa;
        }
    }

    // 비즈니스 메서드
    // 학생 정보 출력
    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + sutdentID);
        System.out.println("나이: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("-------------------");
    }

    // 우수 학생 여부
    public boolean isExcellent() {
        return gpa >= 3.5;
    }
}

// StudentTest.java - 테스트 클래스
class StudentTest {
    public static void main(String[] args) {
        System.out.println("===== 학생 정보 관리 시스템 테스트 =====\n");

        // 학생 객체 생성 테스트
        Student student1 = new Student("김땡땡", 20260105, 20, 3.8);
        Student student2 = new Student("이땡순", 20260206);

        // 정보 출력 테스트
        student1.displayInfo();
        student2.displayInfo();

        // 우수학생 여부 테스트
        System.out.println(student1.name + " 우수학생 여부: " + student1.isExcellent());
        System.out.println(student2.name + " 우수학생 여부: " + student2.isExcellent());
        System.out.println();

        // GPA 업데이트 테스트
        student2.updateGpa(3.2);
        student2.updateGpa(5.0); // 잘못된 값

        // 나이 업데이트 테스트
        student1.updateAge(21);
        student1.updateAge(150); // 잘못된 값

        System.out.println("\n=== 업데이트 후 정보 ===");
        student1.displayInfo();
        student2.displayInfo();
    }
}
