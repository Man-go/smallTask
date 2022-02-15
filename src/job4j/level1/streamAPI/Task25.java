package job4j.level1.streamAPI;

import java.util.stream.Stream;

/**
 * Ваша задача вернуть количество элементов в стриме
 */
public class Task25 {
    public static long count(Stream<Integer> data) {
        return data.count();
    }
}
