package job4j.level1.streamAPI;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача элементы вложенных списков собрать в один список.
 */
public class Task39 {

    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(value -> value.stream())
                .collect(Collectors.toList());
    }
}
