package job4j.level1.sort;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * получить отсортированную мапу из исходной. Сортировка должна быть в обратном порядке.
 */
public class Task13 {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        return new TreeMap<>(map);
    }
}
