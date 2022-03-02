package job4j.level1.streamAPI;

import java.util.Arrays;

/**
 * Ваша задача получить сумму элементов матрицы
 */
public class Task38 {

    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .sum();
    }
}
