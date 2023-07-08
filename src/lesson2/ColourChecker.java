package lesson2;

import java.util.Scanner;

public class ColourChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер цвета: ");

        if (scanner.hasNextInt()) {
            int colourNumber = scanner.nextInt();

            if (colourNumber == 1) {
                System.out.println("Красный");
            } else if (colourNumber == 2) {
                System.out.println("Оранжевый");
            } else if (colourNumber == 3) {
                System.out.println("Желтый");
            } else if (colourNumber == 4) {
                System.out.println("Зеленый");
            } else if (colourNumber == 5) {
                System.out.println("Голубой");
            } else if (colourNumber == 6) {
                System.out.println("Синий");
            } else if (colourNumber == 7) {
                System.out.println("Фиолетовый");
            } else {
                System.out.println("В РАДУГЕ 7 ЦВЕТОВ АЛЛО");
            }
        } else {
            System.out.println("Номер цвета пжлста. От 1 до 7");
        }
    }
}
