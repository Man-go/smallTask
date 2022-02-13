package job4j.level1.streamAPI;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ваша задача собрать, переданный стрим чисел в мапу, где ключ сам элемент, а значение это его квадрат
 */
public class Task19 {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data
                .collect(Collectors.toMap(k -> k, value -> value * value));

    }
}
