package job4j.level1.streamAPI;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Создайте стрим из переданной коллекции
 */
public class Task6 {
    public static Stream<Integer> createStream(Collection<Integer> data) {
       return data.stream();
    }
}
