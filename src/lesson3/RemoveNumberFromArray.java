package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveNumberFromArray {
    public static void main(String[] args) {
        int[] listOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для удаления: ");

        if (scanner.hasNextInt()) {
            int numberToRemove = scanner.nextInt();
            boolean found = false;
            int arraySize = listOfNumbers.length;

            for (int i = 0; i < arraySize; i++) {
                if (listOfNumbers[i] == numberToRemove) {
                    found = true;
                    arraySize--;
                } else if (arraySize != i) {
                    listOfNumbers[i - (found ? 1 : 0)] = listOfNumbers[i];
                }
            }

            if (found) {
                int[] newArray = Arrays.copyOf(listOfNumbers, arraySize);
                System.out.println("Число " + numberToRemove + " удалено из массива.\nНовый массив: " + Arrays.toString(newArray));
            } else {
                System.out.println("Число " + numberToRemove + " не найдено в массиве.");
            }
        } else {
            System.out.println("Incorrect Input");
        }
    }
}
