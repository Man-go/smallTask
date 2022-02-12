package job4j.level1.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * отсортировать переданный список строк, используя метод Collections.sort(),
 * в восходящем порядке. Среди элементов нет null
 */
public class Task10 {
    public static List<String> sort(List<String> data) {
        Collections.sort(data);
        return data;
    }
}
