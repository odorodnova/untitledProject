package lesson2;

import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");

        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            if (t > -5) {
                System.out.println("Тепло");
            } else if (t > -20) {
                System.out.println("Нормально");
            } else if (t < -20) {
                System.out.println("Холодно");
            }
        } else {
            System.out.println("Неправильный ввод");
        }
    }
}
