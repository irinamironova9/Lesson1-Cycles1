public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 0; i <=17; i = i + 2) {
            System.out.println(i);
        }
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10;i--) {
            System.out.println(i);
        }

        // ДЗ Часть 2
        System.out.println("ДЗ Часть 2");
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        // Задание 3
        System.out.println("Задание 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        // ДЗ Часть 3
        System.out.println("ДЗ Часть 3");
        // Задание 1
        System.out.println("Задание 1");
        int monthlySavings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + monthlySavings;
            System.out.println("За " + i + "-й месяц сумма накоплений составляет " + total + " руб.");
        }
        // Задание 2
        System.out.println("Задание 2");
        int monthlySavings2 = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2/100;
            total2 = total2 + monthlySavings2;
            System.out.println("За " + i + "-й месяц сумма накоплений составляет " + total2 + " руб.");
        }

    }
}