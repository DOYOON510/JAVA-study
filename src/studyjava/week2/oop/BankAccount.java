package src.studyJava.week2.oop;

public class BankAccount {

    private String accountnum;
    private String owner;
    private int balance;

    public BankAccount(String accountnum, String owner) {
        this.accountnum = accountnum;
        this.owner = owner;
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;

    }
    public int getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("계좌번호: " + accountnum);
        System.out.println("소유자: " + owner);
        System.out.println("잔액: " + balance + "원");
    }
}
