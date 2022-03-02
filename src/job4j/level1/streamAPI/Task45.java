package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача взять и получить элементы списка, за исключением первых двух
 */
public class Task45 {

    public static List<String> lastThree(List<String> strings) {
        return strings.stream()
                .skip(2)
                .collect(Collectors.toList());
    }
}
