package oop;

class VendingMachine {
    // 필드
    String product;
    int price;

    // 메소드 추가
    public String pushProductButton(int menuId) {
        if (menuId == 1) return "콜라";
        else if (menuId == 2) return "사이다";
        else if (menuId == 3) return "환타";
        else return "없는 상품";
    }
}

public class VendingMachineTest {
    public static void main(String[] args) {
        // 인스턴스 생성
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        // 메시지 전송(메소드 호출)
        String product = vm1.pushProductButton(1);
        System.out.println("선택한 상품: " + product);

        // 자판기를 5개 만들고 싶다면?
        VendingMachine[] machines = new VendingMachine[5];
        for (int i = 0; i < 5; i++) {
            machines[i] = new VendingMachine();
        }

        for (int i = 0; i < 5; i++) {
            String product2 = machines[i].pushProductButton(i + 1);
            System.out.println((i + 1) + "번 자판기 선택: " + product2);

        }
    }
}