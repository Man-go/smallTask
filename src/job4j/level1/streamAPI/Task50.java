package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача получить из списка только отрицательные элементы.
 */
public class Task50 {

    public static List<Integer> takeWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .takeWhile(value -> value < 0)
                .collect(Collectors.toList());
    }
}
