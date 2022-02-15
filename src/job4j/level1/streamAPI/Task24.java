package job4j.level1.streamAPI;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ваша задача собрать, переданный стрим чисел в мапу, где ключ сам элемент,
 * а значение это его квадрат. Нужно использовать версию toMap() описанную в задании.
 */
public class Task24 {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev));
    }
}
