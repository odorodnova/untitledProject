package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int[] listOfNumbers = new int[size];
            Random random = new Random();

            for (int i = 0; i < size; i++) {
                listOfNumbers[i] = random.nextInt(66);
            }

            System.out.println("Массив: ");
            for (int number : listOfNumbers) {
                System.out.print(number + " ");
            }

            int max = Arrays.stream(listOfNumbers).max().getAsInt();
            int min = Arrays.stream(listOfNumbers).min().getAsInt();
            double average = Arrays.stream(listOfNumbers).average().getAsDouble();

            System.out.println("\nМаксимальное значение: " + max
                    + "\nМинимальное значение: " + min
                    + "\nСреднее значение: " + String.format("%.2f", average));
        } else {
            System.out.println("Incorrect Input");
        }
    }
}
