package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Из {"One"} нужно получить {"One.java"}
 */
public class Task33 {

    public static List<String> map(List<String> names) {
        return names.stream()
                .map(value -> value + ".java")
                .collect(Collectors.toList());
    }
}
