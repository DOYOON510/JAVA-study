package week1;

public class IfElseIfPractice1 {
    public static void main(String[] args) {
        int dust = 75; // 미세먼지 수치

        if (dust <= 30) {
            System.out.println("좋음");
        } else if (dust <= 80) {
            System.out.println("보통");
        } else if (dust <= 150) {
            System.out.println("나쁨");
        } else {
            System.out.println("매우 나쁨");
        }
    }
}

