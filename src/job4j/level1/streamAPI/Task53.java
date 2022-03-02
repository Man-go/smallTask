package job4j.level1.streamAPI;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Ваша задача найти первую строку, которая кончается на ".java" и вернуть Optional из длины этой строки
 */
public class Task53 {
    public static Optional<Integer> flatMap(List<String> strings) {
        return strings.stream()
                .filter(value -> value.endsWith(".java"))
                .findFirst()
                .map(String::length);

    }
}
