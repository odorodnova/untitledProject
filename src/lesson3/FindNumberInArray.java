package lesson3;

import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args) {
        int[] listOfNumbers = {1, 2, 6, 8, 10, 666};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");

        if (scanner.hasNextInt()) {
            int enteredNumber = scanner.nextInt();
            boolean found = false;

            for (int number : listOfNumbers) {
                if (number == enteredNumber) {
                    found = true;
                    break;
                }
            }
            System.out.println("Число " + enteredNumber + (found ? " найдено в массиве." : " не найдено в массиве."));
        } else {
            System.out.println("Incorrect Input");
        }
    }
}
