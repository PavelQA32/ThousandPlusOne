public class Main {
    public static void main(String[] args) {
        int balance = 34;
        int refill = 1000;
        int refillBalance = balance + refill;
        int bonusSystem = refillBalance / 100 * 1;

        if (refill > 1000) {
            refillBalance = refillBalance + bonusSystem;
        }
        System.out.println(refillBalance + " - пополнение баланса");
        System.out.println(bonusSystem + " - бонусов начисленно");
    }
}
