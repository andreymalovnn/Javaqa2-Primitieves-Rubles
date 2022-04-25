public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int refill = 2000;
        boolean quoted = true;
        int quote = 100;
        int bonus = quoted ? (refill / quote) : 0;
        int total = balance + refill + bonus;
        System.out.println("Баланс = " + total);
        System.out.println("Начислено бонусов = " + bonus);
    }
}