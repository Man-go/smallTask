package job4j.level1.lambda;

import java.util.Optional;

/**
 * 1. Написать метод max(). Он находит максимальный элемент массива. Если массив пуст,
 * то возвращает пустой Optional, в противном случае Optinal из максимального значения
 * 2. Метод ifPresent() вызывает метод max(). Если значение существует, то выводит
 * максимальное значение например, "Max: 3". Для вывода нужно использовать System.out.println()
 */
public class Task14 {
    public static void ifPresent(int[] data) {
        Optional<Integer> optional = max(data);
        optional.ifPresent(value -> System.out.println("Max: " + value));
    }

    private static Optional<Integer> max(int[] data) {
        int ln = data.length;
        if(ln == 0) {
            return Optional.empty();
        }

        int max = data[0];
        for (int i : data) {
            if (i > max) {
                max = i;
            }
        }
        return Optional.of(max);
    }
}
