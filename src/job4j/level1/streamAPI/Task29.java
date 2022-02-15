package job4j.level1.streamAPI;

import java.util.List;

/**
 * Ваша задача проверить, что в списке нет пустых строк
 */
public class Task29 {
    public static boolean check(List<String> list) {
        return list.stream()
                .noneMatch(value -> value.equals(""));
    }
}
