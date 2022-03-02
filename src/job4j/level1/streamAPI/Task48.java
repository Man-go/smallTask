package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача, получить список отсортированных строк
 */
public class Task48 {

    public static List<String> sorted(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
