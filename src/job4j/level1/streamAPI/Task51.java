package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача оставить в списке только положительные элементы.
 */
public class Task51 {

    public static List<Integer> dropWhile(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .dropWhile(value -> value < 0)
                .collect(Collectors.toList());
    }
}
