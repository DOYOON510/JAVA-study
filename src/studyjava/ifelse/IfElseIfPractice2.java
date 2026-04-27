package ifelse;

public class IfElseIfPractice2 {
    public static void main(String[] args) {
        int price = 120000; // 원래 구매 금액
        int finalPrice = 0; // 최종 결제 금액을 저장할 변수

        if (price >= 100000) {
            finalPrice = (int) (price * 0.8);
        } else if (price >= 50000) {
            finalPrice = (int) (price * 0.9);
        } else {
            finalPrice = price;
        }

        System.out.println("최종 결제 금액은 " + finalPrice + "원입니다.");
    }
}
