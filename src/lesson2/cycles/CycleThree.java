package lesson2.cycles;

import java.util.Scanner;

public class CycleThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи целое положительное число: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + num + " равна " + sum);
    }
}
