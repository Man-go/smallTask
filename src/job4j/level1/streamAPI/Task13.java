package job4j.level1.streamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Даны вложенные итераторы. Нужно написать метод, который соберет все элементы данных итераторов в List.
 */
public class Task13 {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return iteratorToStream(it)
                .flatMap(value -> iteratorToStream(value))
                .collect(Collectors.toList());
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false);
    }
}
