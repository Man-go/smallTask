package job4j.level1.streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача отсортировать строки по убыванию.
 */
public class Task49 {

    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
