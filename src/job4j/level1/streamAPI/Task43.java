package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан исходный список. Получить список без элементов, кратных 4, из исходного списка.
 * Например, {1, 2, 3, 4, 5, 8} -> {1, 2, 3, 5}
 */
public class Task43 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(value -> value % 4 != 0)
                .collect(Collectors.toList());
    }
}
