package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача отфильтровать список, оставив в нем только четные числа
 */
public class Task40 {

    public static List<Integer> filter(List<Integer> data) {
        return data.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());
    }
}
