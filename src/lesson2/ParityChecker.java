package lesson2;

import java.util.Scanner;

public class ParityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Число " + number + " является четным.");
            } else {
                System.out.println("Число " + number + " является нечетным.");
            }
        } else {
            System.out.println("Неправильный ввод. Введите число");
        }
    }
}
