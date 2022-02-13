package job4j.level1.streamAPI;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ваша задача собрать, переданный стрим в сет
 */
public class Task17 {
    public static Set<Integer> collect(Stream<Integer> data) {
        return data
                .collect(Collectors.toSet());
    }
}
