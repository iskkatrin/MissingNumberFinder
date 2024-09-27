package org.example;

import java.util.Arrays;

/**
 * Функция для нахождения первого пропущенного числа в массиве последовательных чисел.
 */

public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr) {
        // Находим минимальное и максимальное значение в массиве
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);

        // Создаем булев массив для отметок присутствующих чисел
        boolean[] present = new boolean[max - min + 1];

        // Отмечаем присутствующие числа
        for (int num : arr) {
            present[num - min] = true;
        }

        // Ищем первое пропущенное число
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                return min + i;
            }
        }

        // Если все числа на месте, возвращаем max + 1 (следующее за максимальным)
        return max + 1;
    }
}