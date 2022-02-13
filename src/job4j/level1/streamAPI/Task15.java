package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ваша задача собрать, переданный стрим в список
 */
public class Task15 {
    public static List<Integer> collect(Stream<Integer> data) {
        return data
                .collect(Collectors.toList());
    }
}
