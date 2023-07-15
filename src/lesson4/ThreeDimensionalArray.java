package lesson4;

import java.util.Scanner;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для увеличения элементов массива: ");
        int[][][] listsOfNumbers = {{{6, 12, 18}, {24, 30, 36}}, {{42, 48, 54}, {60, 66, 72}}};

        if (scanner.hasNextInt()) {
            int increment = scanner.nextInt();
            System.out.println("Измененный массив:");

            for (int i = 0; i < listsOfNumbers.length; i++) {
                for (int j = 0; j < listsOfNumbers[i].length; j++) {
                    for (int k = 0; k < listsOfNumbers[i][j].length; k++) {
                        listsOfNumbers[i][j][k] += increment;
                        System.out.print(listsOfNumbers[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        } else {
            System.out.println("Incorrect input");
        }
    }
}
