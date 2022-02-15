package job4j.level1.streamAPI;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Ваша задача создать из стрима коллекцию LinkedHashSet
 */
public class Task21 {
    public static Set<Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
