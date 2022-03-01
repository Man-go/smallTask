package job4j.level1.streamAPI;

import java.util.List;

/**
 * Ваша задача преобразовать стрим Character в IntStream,
 * т.е. в стрим кодов символов, и получить сумму этих кодов
 */
public class Task36 {

    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToInt(value -> (int) value)
                .sum();
    }
}
