package job4j.level1.streamAPI;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ваша задача преобразовать стрим, который вернет chars(), в стрим Charater и собрать в список.
 */
public class Task35 {

    public static List<Character> symbols(String string) {
        return string.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.toList());
    }
}
