package job4j.level1.streamAPI;

import java.util.Comparator;
import java.util.List;

/**
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 */
public class Task5 {
    public static String min(List<String> list) {
        return list.stream()
                .min(String::compareTo)
                .get();
    }
}
