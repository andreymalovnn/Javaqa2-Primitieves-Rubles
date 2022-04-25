public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int refill = 1500;
        int quote = 100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / quote;
        } else {
            bonus = 0;
        }
        int total = balance + refill + bonus;
        System.out.println("Баланс = " + total);
        System.out.println("Начислено бонусов = " + bonus);
    }
}