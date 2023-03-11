package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 500;
        long bonus;
        long amount = 500_000;
        boolean registered = true;
        bonus = service.calculate (amount, registered);
        System.out.println("Фактическое количество бонусов: " + bonus + " бонусов");
        System.out.println("Ожидаемое количество бонусов: " + expected + " бонусов");
    }
}