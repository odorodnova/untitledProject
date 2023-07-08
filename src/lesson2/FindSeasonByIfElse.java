package lesson2;

import java.util.Scanner;

public class FindSeasonByIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");

        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();
            String season;

            if (month == 12 || month == 1 || month == 2) {
                season = "Зима";
            } else if (month >= 3 && month <= 5) {
                season = "Весна";
            } else if (month >= 6 && month <= 8) {
                season = "Лето";
            } else if (month >= 9 && month <= 11) {
                season = "Осень";
            } else {
                season = "В ГОДУ 12 МЕСЯЦЕВ АЛЛО";
            }

            System.out.println("Время года: " + season);
        } else {
            System.out.println("Номер месяца пжлста. От 1 до 12");
        }
    }
}
