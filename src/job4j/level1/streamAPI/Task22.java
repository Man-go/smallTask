package job4j.level1.streamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ваша задача собрать Map из стрима чисел, где ключ это само число,
 * а значение его квадрат. Сборка должна быть в LinkedHashMap
 */
public class Task22 {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev, LinkedHashMap::new));
    }
}
