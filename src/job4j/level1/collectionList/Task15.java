package job4j.level1.collectionList;

import java.util.ArrayList;
import java.util.List;

/**
 * Необходимо реализовать метод, который генерирует геометрическую прогрессию и при этом принимает 3 значения:
 * 1. Первый элемент геометрической прогрессии;
 * 2. Знаменатель прогрессии;
 * 3. Количество элементов, которое должно содержаться в сгенерированной последовательности.
 * При этом метод должен вернуть сумму элементов сгенерированной последовательности.
 */
public class Task15 {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = first;
        for (int i = 2; i <= count; i++) {
            sum += first * Math.pow(denominator, i - 1);
        }
        return sum;
    }
}
