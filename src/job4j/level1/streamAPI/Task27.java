package job4j.level1.streamAPI;

import java.util.List;

/**
 * Ваша задача проверить, что переданный список содержит строки, длина которых больше 3.
 */
public class Task27 {
    public static boolean check(List<String> list) {
        return list.stream()
                .allMatch(value -> value.length() > 3);
    }
}
