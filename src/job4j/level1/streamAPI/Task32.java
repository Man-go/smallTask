package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача из заданного списка чисел получить список квадратов этих чисел
 */
public class Task32 {

    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream()
                .map(value -> value * value)
                .collect(Collectors.toList());
    }
}
