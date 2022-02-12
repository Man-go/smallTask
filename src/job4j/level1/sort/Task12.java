package job4j.level1.sort;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * получить сет из списка с порядком по убыванию. Среди элементов нет null.
 */
public class Task12 {
    public static Set<String> sort(List<String> list) {
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);
        return set;
    }
}
