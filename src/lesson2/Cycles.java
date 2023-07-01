package lesson2;

import java.util.Scanner;

public class Cycles {

    static class CycleOne {
        public static void main(String[] args) {
            for (int i = 1; i <= 99; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    static class CycleTwo {
        public static void main(String[] args) {
            for (int i = 5; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }

    static class CycleThree {
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

    static class CycleFour {
        public static void main(String[] args) {
            int i = 7;
            while (i <= 98) {
                System.out.println(i);
                i += 7;
            }
        }
    }

    static class CycleFive {
        public static void main(String[] args) {
            int num = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println(num);
                num -= 5;
            }
        }
    }

    static class CycleSix {
        public static void main(String[] args) {
            for (int i = 10; i <= 20; i++) {
                int square = i * i;
                System.out.println(square);
            }
        }
    }
}
