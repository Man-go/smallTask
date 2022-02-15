package job4j.level1.streamAPI;

import java.util.List;

/**
 * Ваша задача проверить, что хотя бы одна строка списка начинается с "job4j"
 */
public class Task28 {
    public static boolean check(List<String> data) {
        return data.stream()
                .anyMatch(value -> value.startsWith("job4j"));
    }
}
