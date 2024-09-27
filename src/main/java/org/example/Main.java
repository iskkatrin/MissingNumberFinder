package org.example;

import static org.example.MissingNumberFinder.findMissingNumber;

public class Main {
    public static void main(String[] args) {
        // Тесты для проверки
        int[] example1 = {5, 0, 1, 3, 2};
        int missingNumber1 = findMissingNumber(example1);
        System.out.println("Пропущенное число: " + missingNumber1); // Ожидаемый вывод: 4

        int[] example2 = {7, 9, 10, 11, 12};
        int missingNumber2 = findMissingNumber(example2);
        System.out.println("Пропущенное число: " + missingNumber2); // Ожидаемый вывод: 8

        int[] example3 = {1, 2, 3};
        int missingNumber3 = findMissingNumber(example3);
        System.out.println("Пропущенное число: " + missingNumber3); // Ожидаемый вывод: 4

        int[] example4 = {0, 1, 2, 4};
        int missingNumber4 = findMissingNumber(example4);
        System.out.println("Пропущенное число: " + missingNumber4); // Ожидаемый вывод: 3

        int[] example5 = {0, 1, 2, 3};
        int missingNumber5 = findMissingNumber(example5);
        System.out.println("Пропущенное число: " + missingNumber5); // Ожидаемый вывод: 4
    }
}