package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача взять первые 3 элемента из списка
 */
public class Task44 {
    public static List<String> firstThree(List<String> strings) {
        return strings.stream()
                .limit(3)
                .collect(Collectors.toList());
    }
}
