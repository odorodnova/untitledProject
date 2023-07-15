package lesson3;

public class TwoArraysOneCup {
    public static void main(String[] args) {
        int[] firstListOfNumbers = {4, 8, 15, 16, 23};
        int[] secondListOfNumbers = {42, 4, 8, 15, 16};

        System.out.println("Первый массив: ");
        for (int number : firstListOfNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nВторой массив: ");
        for (int number : secondListOfNumbers) {
            System.out.print(number + " ");
        }

        int firstSum = 0;
        for (int i : firstListOfNumbers) {
            firstSum += i;
        }
        int secondSum = 0;
        for (int i : secondListOfNumbers) {
            secondSum += i;
        }

        double firstAverage = (double) firstSum / firstListOfNumbers.length;
        double secondAverage = (double) secondSum / firstListOfNumbers.length;

        System.out.println("\nСреднее арифметическое первого массива: " + firstAverage +
                "\nСреднее арифметическое второго массива: " + secondAverage);

        String comparisonResult = (firstAverage > secondAverage) ? "больше" :
                (firstAverage < secondAverage) ? "меньше" : "равно";

        System.out.println("\nСреднее арифметическое первого массива " + comparisonResult + " сред.арифм. второго массива.");
    }
}
