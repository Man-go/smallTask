package job4j.level1.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ваша задача получить отсортированный сет по списку строк. Среди элементов нет null.
 */
public class Task11 {
    public static Set<String> sort(List<String> list) {
        return new TreeSet<>(list);
    }
}
